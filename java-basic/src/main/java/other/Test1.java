package other;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test1 {

    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studydb","study","1111");
        
        System.out.println("연결됨");
          
        
        Statement stmt = con.createStatement();
        
        ResultSet rs = stmt.executeQuery("select*from jdbc_test");
        
        while(rs.next()) {
            System.out.printf("%d,%s,%s,%s,%d\n", 
                    rs.getInt("no"),
                    rs.getString("title"),
                    rs.getString("conts"),
                    rs.getDate("regdt"),
                    rs.getInt("vwcnt"));
        }
        
        rs.close();
        
        stmt.close();
        
        con.close();
        
    }
}
