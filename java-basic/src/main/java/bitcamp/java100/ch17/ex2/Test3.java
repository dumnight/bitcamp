package bitcamp.java100.ch17.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test3 {

    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver"); // 주어진 이름의 클래스를 찾아서 로딩
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb","study","1111");
        
        System.out.println("연결되었음");
        
        Statement stmt = con.createStatement();
        
        stmt.executeUpdate("delete from jdbc_test where no=1");
        
        System.out.println("삭제 완료");
        
        stmt.close();
        con.close();
    }
}
   