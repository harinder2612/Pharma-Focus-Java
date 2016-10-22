package myjframe;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class medicineimp {
Driver d;
      String url="jdbc:mysql://localhost:3306/seller";
      String user="root";
      String password="root";   

      public void add(String medin,int pric,int quan,String selle,String pin)
{
    try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("database medi connected");
     Statement st=conn.createStatement();
PreparedStatement s=conn.prepareStatement("insert into medi values(?,?,?,?,?)");
     s.setString(1,medin);
     s.setInt(2,pric);
     s.setInt(3, quan);
     s.setString(4,selle);
     s.setString(5, pin);
     s.executeUpdate();
    }catch (SQLException ex)
  {System.out.println("error"+ex);
  }
} 
      
public void update(String medin,int pric,int quan,String omedin,String pin)
{
try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("database update medi connected");
     Statement st=conn.createStatement();
PreparedStatement s=conn.prepareStatement("update medi set Medicine_Name=? ,Price=?,Quantity_Available=?,Pincode=? where Medicine_Name=?");
     s.setString(1,medin);
     s.setInt(2,pric);
     s.setInt(3, quan);
     s.setString(5,omedin);
     s.setString(4, pin);
     s.executeUpdate();
    }catch (SQLException ex)
  {System.out.println("error"+ex);
  }
}

public void remove(String omedin)
{
try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("database del medi connected");
     Statement st=conn.createStatement();
PreparedStatement s=conn.prepareStatement("delete from medi where Medicine_Name=?");
     s.setString(1,omedin);
    s.executeUpdate();
    }catch (SQLException ex)
  {System.out.println("error"+ex);
  }
}

}
