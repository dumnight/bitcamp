package bitcamp.java100.ch17.ex1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test4 {

    public static void main(String[] args) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver"); // 주어진 이름의 클래스를 찾아서 로딩
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studydb","study","1111");
        
        System.out.println("연결되었음");
        con.close();
    }
}
   