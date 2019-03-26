import java.sql.*;

public class import javax.swing.text.DefaultEditorKit.InsertBreakAction; {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/intern_demo";
   static final String USER = "root";
   static final String PASS = "root";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection(DB_URL,USER,PASS);
      System.out.println("inserting into table...");
      stmt = conn.createStatement();
      String sql;
      sql = "INSERT INTO intern_demo.candidate " +
      "VALUES (100, 'raj', 'prts', 'abc street','france',800789,'f','ghy@gmail.com','everything')";
      ResultSet rs = stmt.executeQuery(sql);
      rs.close();
      stmt.close();
      conn.close();
   }catch(SQLException se){
      se.printStackTrace();
   }catch(Exception e){
      e.printStackTrace();
   }finally{
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
   System.out.println("Goodbye!");
}
}