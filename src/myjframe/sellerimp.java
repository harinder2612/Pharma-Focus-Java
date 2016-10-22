package myjframe;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class sellerimp {
Driver d;
      String url="jdbc:mysql://localhost:3306/seller";
      String user="root";
      String password="root";   
public void add(seller se)
{
    try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("database connected");
     Statement st=conn.createStatement();
        System.out.println(se.owner);
     PreparedStatement s=conn.prepareStatement("insert into sellerinfo values(?,?,?,?,?,?,?,?,?,?)");
     s.setString(1,se.owner);
     s.setString(2,se.username);
     s.setString(3,se.password);
     s.setString(4,se.company); 
     s.setString(5,se.lic);
     s.setString(6, se.val);
     s.setString(7,se.mobile);
     s.setString(8,se.addr);
     s.setString(9,se.mail);
     s.setString(10,se.pincode);
      s.executeUpdate();
}catch (SQLException ex)
  {System.out.println("error"+ex);
  }

}


public boolean get(String username,String pwd)
{ boolean flag=false;
try{ 
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("database connected");
     Statement st=conn.createStatement();
        
     ResultSet rs=st.executeQuery("select * from sellerinfo");
     while(rs.next())
     {
     if(username.equals(rs.getString(2))&&pwd.equals(rs.getString(3)))
     flag=true;
     }
     

}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
return flag;
}

public String getpincode(String username)
{ String flag=null;
try{ 
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("database connected");
     Statement st=conn.createStatement();
        
     ResultSet rs=st.executeQuery("select * from sellerinfo");
     while(rs.next())
     {
     if(username.equals(rs.getString(2)))
     flag=rs.getString(10);
     }
     

}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
return flag;
}
 public Connection connec() throws SQLException
 {
    d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("database connected");
     Statement st=conn.createStatement();
  return conn;
    }

  public void updatequant(String pname,int quant,String seller)
{
    try{  
       d=new Driver();
       Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println(" update quant connected");
     Statement st=conn.createStatement();
       
     PreparedStatement s=conn.prepareStatement("update medi set Quantity_Available=? where Medicine_Name=? and Seller_Name=?");
     s.setInt(1,(quant-1));
          s.setString(2,pname); 
     s.setString(3,seller);
     s.executeUpdate();
}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
}

 public void updatequant2(String pname,String seller)
{
    try{  
       d=new Driver();
       Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println(" update quant connected");
     Statement st=conn.createStatement();
       
     PreparedStatement s=conn.prepareStatement("update medi set Quantity_Available=Quantity_Available+1 where Medicine_Name=? and Seller_Name=?");
          s.setString(1,pname); 
     s.setString(2,seller);
     s.executeUpdate();
}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
}

}

