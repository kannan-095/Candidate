import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Candidate {
	private int userid,zipcode;  
	private String username,password,address,country,email,about,sex;  
	public int getId() {  
	    return userid;  
	}  
	public void setId(int id) {  
	    this.userid = id;  
	}  
	public String getusername() {  
	    return username;  
	}  
	public void setusername(String name) {  
	    this.username = name;  
	}  
	public String getPassword() {  
	    return password;  
	}  
	public void setPassword(String password) {  
	    this.password = password;  
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public String getaddress() {
		return address;
	}
	public String getEmail() {  
	    return email;  
	}  
	public void setEmail(String email) {  
	    this.email = email;  
	}  
	public String getCountry() {  
	    return country;  
	}  
	public void setCountry(String country) {  
	    this.country = country;  
	}  
	
	public int  getzipcode() {  
	    return zipcode;  
	}  
	public void setzipcode(int code) {  
	    this.zipcode = code;  
	} 
	public String getsex() {  
	    return sex;  
	}  
	public void setsex(String sex) {  
	    this.sex = sex;  
	}  
	public String getabout() {  
	    return sex;  
	}  
	public void setabout(String about) {  
	    this.about = about;  
	}
	public static int save(Candidate c) {
		// TODO Auto-generated method stub
		  int status=0;  
	        try{  
	            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/intern_demo","root","root");  
	            PreparedStatement ps=conn.prepareStatement(  "INSERT INTO `intern_demo`.`candidate` (`userid`, `password`, `username`, `address`, `country`, `zipcode`, `sex`, `email`, `about`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?");
	            ps.setLong(1,c.getId());
	            ps.setString(2,c.getusername());  
	            ps.setString(3,c.getPassword());  
	            ps.setString(4,c.getEmail());  
	            ps.setString(5,c.getCountry());
	            ps.setString(6,c.getaddress());
	            ps.setLong(7,c.getzipcode());
	            ps.setString(8,c.getsex());
	            ps.setString(9,c.getabout());
	              
	            status=ps.executeUpdate();  
	              
	            conn.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	}  
	
}
