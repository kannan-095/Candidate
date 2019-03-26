import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet{
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)   
		         throws ServletException, IOException {  
		        response.setContentType("text/html");  
		        PrintWriter out=response.getWriter();  
		        String userid=request.getParameter("id");  
		        String username=request.getParameter("username");  
		        String password=request.getParameter("password");  
		        String email=request.getParameter("email");  
		        String country=request.getParameter("country");
		        String zipcode=request.getParameter("zipcode");
		        String sex=request.getParameter("sex");
		        String address=request.getParameter("address");
		        String about=request.getParameter("about");
		       
		        Candidate c=new Candidate();
		  	c.setuserid(id);
		        c.setusername(username);  
		        c.setPassword(password);  
		        c.setEmail(email);  
		        c.setCountry(country); 
		        c.setzipcode(zipcode);
		  	c.setsex(sex);
		  	c.setaddress(address);
		  	c.setabout(about);
		        int status=0;  
		        if(status>0){  
		            out.print("<p>Record saved successfully!</p>");  
		            request.getRequestDispatcher("index.html").include(request, response);  
		        }else{  
		            out.println("Sorry! unable to save record");  
		        }  
		          
		        out.close();  
		    }  
		  
}
