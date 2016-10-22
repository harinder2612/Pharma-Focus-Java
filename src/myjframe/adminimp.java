package myjframe;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class adminimp {
Driver d;
      String url="jdbc:mysql://localhost:3306/admin";
      String user="root";
      String password="root";  
      
      public boolean get(String username,String pwd)
{ boolean flag=false;
try{ 
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("Admin database connected");
     Statement st=conn.createStatement();
        
     ResultSet rs=st.executeQuery("select * from admininfo");
     while(rs.next())
     {
     if(username.equals(rs.getString(1))&&pwd.equals(rs.getString(2)))
     flag=true;
     }
     

}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
return flag;
}

}
