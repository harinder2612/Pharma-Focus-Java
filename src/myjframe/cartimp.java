package myjframe;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class cartimp {
 Driver d;
      String url="jdbc:mysql://localhost:3306/customer";
      String user="root";
      String password="root";   
     
      
      public Connection custconnec() throws SQLException
 {
    d=new Driver();
     url="jdbc:mysql://localhost:3306/customer";
    Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("database connected");
     Statement st=conn.createStatement();
  return conn;
    }
      
      public void refreshcart(String customer,String pname)
      {
          try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("cart refresh connected");
     Statement st=conn.createStatement();
     PreparedStatement s=conn.prepareStatement("delete from cart where Customer_Name=? and Product_Name=? ");
     s.setString(1,customer);
     s.setString(2,pname);
     s.executeUpdate();
}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
      }

      
      public void addtocart(String pname,int price,String seller,String customer)
{
    try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println(" cart connected");
     Statement st=conn.createStatement();
       
     PreparedStatement s=conn.prepareStatement("insert into cart values(?,?,?,?)");
     s.setString(1,pname);
          s.setInt(2,price); 
     s.setString(3,seller);
     s.setString(4,customer);
     s.executeUpdate();
}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
}

 public int items(String customer)
      {int flag=0;
          try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("database item count connected");
     Statement st=conn.createStatement();
               ResultSet rs=st.executeQuery("select * from cart");
     while(rs.next())
     {
     if(customer.equals(rs.getString(4)))
     flag++;
     }
              System.out.println(flag);
     
}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
      return flag;}

 public void remove(String pname,String customer)
{
    try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println(" remove from cart connected");
     Statement st=conn.createStatement();
       
     PreparedStatement s=conn.prepareStatement("delete from cart where Product_Name=? and Customer_Name=? ");
     s.setString(1,pname);
     s.setString(2,customer);
     s.executeUpdate();
}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
}

 public boolean itemexist(String customer,String pname)
      {boolean flag=false;
          try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("item alreadyexist connected");
     Statement st=conn.createStatement();
               ResultSet rs=st.executeQuery("select * from cart");
     while(rs.next())
     {
     if(customer.equals(rs.getString(4))&&pname.equals(rs.getString(1)))
     flag=true;
     }
     
}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
      return flag;
  }
 
 public void placeorder(String pname,int quantity,int price,String seller,String customer,String delivery,String status)
{
    try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println(" orders connected");
     Statement st=conn.createStatement();
       
     PreparedStatement s=conn.prepareStatement("insert into orders values(?,?,?,?,?,?,?)");
     s.setString(1,pname);
          s.setInt(2,quantity); 
     s.setInt(3,price); 
          s.setString(4,seller);
     s.setString(5,customer);
     s.setString(6,delivery);
     s.setString(7,status);
     s.executeUpdate();
}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
}

 public int total(String customer)
      {int flag=0;
          try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("total count connected");
     Statement st=conn.createStatement();
      PreparedStatement s=conn.prepareStatement("select * from orders where Delivery=? and Customer=?");         
     s.setString(1,"none");
     s.setString(2,customer);
      ResultSet rs=s.executeQuery();
     while(rs.next())
     {
     if(customer.equals(rs.getString(5)))
     flag+=rs.getInt(3);
     }
     
}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
      return flag;
      }

public boolean alreadyexist(String customer,String pname)
      {boolean flag=false;
          try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("item alreadyexist connected");
     Statement st=conn.createStatement();
      PreparedStatement s=conn.prepareStatement("select * from orders where Delivery=?");    
      s.setString(1,"none");
     ResultSet rs=s.executeQuery();
     while(rs.next())
     {
     if(customer.equals(rs.getString(5))&&pname.equals(rs.getString(1)))
     flag=true;
     }
     
}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
      return flag;
  }

public String seller(String customer,String pname)
      {String flag=null;
          try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println("return seller name connected");
     Statement st=conn.createStatement();
     ResultSet rs=st.executeQuery("select * from orders");
     while(rs.next())
     {
     if(customer.equals(rs.getString(5))&&pname.equals(rs.getString(1)))
     flag=rs.getString(4);
     }
     
}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
      return flag;
  }

public void remove2(String customer,String pname)
{
    try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println(" remove from bill connected");
     Statement st=conn.createStatement();
       
     PreparedStatement s=conn.prepareStatement("delete from orders where Customer=? and Product_Name=?");
     s.setString(1,customer);
     s.setString(2,pname);
     s.executeUpdate();
}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
}

public void confirmorder(String customer,String value)
{
    try{  
       d=new Driver();
      Connection conn=DriverManager.getConnection(url,user,password);
      System.out.println(" delivery type connected");
     Statement st=conn.createStatement();
       
     PreparedStatement s=conn.prepareStatement("update orders set Delivery=? where Customer=? and Delivery=?");
     s.setString(1,value);
     s.setString(2,customer);
     s.setString(3,"none");
     s.executeUpdate();
}catch (SQLException ex)
  {System.out.println("error"+ex);
  }
}



}

