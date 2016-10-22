package myjframe;

public class customer {
    public String name,email,addr,username,pwd,mobile;
    public int pincode;
    
    public customer()
    {}
    
    public customer(String name,String mobile,String email,String username,String pwd,String addr,int pincode)
    {
    this.name=name;
    this.mobile=mobile;
    this.email=email;
    this.username=username;
    this.pwd=pwd;
    this.addr=addr;
    this.pincode=pincode;
        System.out.println("constructor called");
    }

}
