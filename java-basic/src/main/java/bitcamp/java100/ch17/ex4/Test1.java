package bitcamp.java100.ch17.ex4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Test1 {

    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver"); 
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb","study","1111");
        
        PreparedStatement pstmt = con.prepareStatement(
                "insert into jdbc_test(title,conts,regdt) values(?,?,now())");
        
        pstmt.setString(1, "제목");
        pstmt.setString(2, "내용");
        pstmt.executeUpdate();
        
        System.out.println("입력 완료");
        
        pstmt.close();
        con.close();
    }
}
   