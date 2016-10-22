package myjframe;
import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class customerimp {
    
 Driver d;
      String url="jdbc:mysql://localhost:3306/customer";
      String user="root";
      String password="root";   
public void add(customer s1)
{
    try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("database connected");
     Statement st=conn.createStatement();
        System.out.println(s1.username);
     PreparedStatement s=conn.prepareStatement("insert into cust values(?,?,?,?,?,?,?)");
     s.setString(1,s1.name);
          s.setString(2,s1.mobile); 
     s.setString(3,s1.email);
     s.setString(4,s1.username);
     s.setString(5,s1.pwd);
     s.setString(6,s1.addr);
     s.setInt(7,s1.pincode);
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
        
     ResultSet rs=st.executeQuery("select * from cust");
     while(rs.next())
     {
     if(username.equals(rs.getString(4))&&pwd.equals(rs.getString(5)))
     flag=true;
     }
     

}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
return flag;
}

public Connection connec() throws SQLException
 {
    d=new Driver();
     url="jdbc:mysql://localhost:3306/seller";
    Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("database connected");
     Statement st=conn.createStatement();
  return conn;
    }



public String pin(String username)
{ String flag=null;
try{ 
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("database connected");
     Statement st=conn.createStatement();
        
     ResultSet rs=st.executeQuery("select * from cust");
     while(rs.next())
     {
     if(username.equals(rs.getString(4)))
     flag=rs.getString(7);
     }
     

}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
return flag;
}

public customer custdetails(String username)
{ customer flag=null;
try{ 
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("custdetails connected");
     Statement st=conn.createStatement();
        
     ResultSet rs=st.executeQuery("select * from cust");
     while(rs.next())
     {
     if(username.equals(rs.getString(4)))
     flag=new customer(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
     }
     
}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
return flag;
}

public void interact(String customer,String seller,String path,String note)
{ try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("database connected");
     Statement st=conn.createStatement();
       
     PreparedStatement s=conn.prepareStatement("insert into interact values(?,?,?,?)");
     s.setString(1,customer);
          s.setString(2,seller); 
     s.setString(3,path);
     s.setString(4,note);
     s.executeUpdate();
}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
}

public void status(String customer,String seller,String pname)
{ try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("database connected");
     Statement st=conn.createStatement();
       
     PreparedStatement s=conn.prepareStatement("update orders set Status=? where Customer=? and Seller=? and Product_Name=?");
     s.setString(1,"dispatch");
          s.setString(2,customer); 
     s.setString(3,seller);
     s.setString(4,pname);
     s.executeUpdate();
}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
}

public String note(String path)
{ String flag=null;
try{ 
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("database connected");
     Statement st=conn.createStatement();
        
     ResultSet rs=st.executeQuery("select * from interact");
     while(rs.next())
     {
     if(path.equals(rs.getString(3)))
     flag=rs.getString(4);
     }
     

}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
return flag;
}


}

