import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sun.corba.se.pept.transport.Connection;

public class delete {
    public static int delete(int id){  
        int status=0;  
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");
    		Connection conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/intern_demo","root","root");
        	PreparedStatement ps=conn.PreparedStatement("delete from mona where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            conn.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Candidate getCandidateById(int id){  
        Candidate c=new Candidate();  
          
        try{  
        	Class.forName("com.mysql.cj.jdbc.Driver");
            PreparedStatement ps=conn.prepareStatement("select * from mona where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                c.setId(rs.getInt(1));  
                c.setusername(rs.getString(2));  
                c.setPassword(rs.getString(3));  
                c.setEmail(rs.getString(4));  
                c.setCountry(rs.getString(5));  
                c.setaddress(rs.getString(6));
                c.setsex(rs.getString(7));
                c.setzipcode(rs.getInt(8));
                c.setabout(rs.getString(9));
                
            }  
            conn.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return c;  
    } 
}
