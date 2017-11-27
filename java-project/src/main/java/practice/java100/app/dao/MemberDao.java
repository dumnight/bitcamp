package practice.java100.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import practice.java100.app.domain.Member;
import practice.java100.app.util.DataSource;

public class MemberDao {
    
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // => com.mysql.jdbc.Driver 클래스를 로딩한다.
            // => static {} 블록을 수행한다.
            // => Driver 인스턴스를 생성한다.
            // => DriverManager에 그 인스턴스를 등록한다.

        } catch (ClassNotFoundException ex) {
            // 이 예외가 발생하면 init()를 호출한 쪽에 예외를 던진다.
            // 단 RuntimeException 예외인 경우 스텔스 방식으로 전달되기 때문에,
            // 굳이 메서드 선언부에 어떤 예외를 던지는지 적시할 필요는 없다.
            throw new RuntimeException("JDBC 드라이버 클래스를 찾을 수 없습니다.");
        }
    }
    public List<Member> selectList(){
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            con = DataSource.getConnection();
            pstmt = con.prepareStatement("select no,name,email,regdt from ex_memb");
            rs = pstmt.executeQuery();
            ArrayList<Member> list = new ArrayList<>();
            while (rs.next()) {
                Member member = new Member(
                        rs.getInt("no"),
                        rs.getString("name"), 
                        rs.getString("email"),
                        rs.getDate("regdt"));
                list.add(member);
            }
            return list;
            
        } catch (Exception e) {
            throw new DaoException();
        } finally {
            try {pstmt.close();} catch (Exception e) {}
            DataSource.returnConnection(con);
        }
    }
    public int insert(Member member) {
        Connection con = null;
        PreparedStatement pstmt = null;
        
        try {
            con = DataSource.getConnection();
            pstmt = con.prepareStatement("insert into ex_memb(name,email,pwd,regdt)"
                    + " values(?,?,password(?),now())");
            pstmt.setInt(1, member.getNo());
            pstmt.setString(2, member.getEmail());
            pstmt.setString(3, member.getPassword());
            
            return pstmt.executeUpdate();
            
        } catch (Exception e) {
            throw new DaoException();
        } finally {
            try {pstmt.close();} catch (Exception e) {}
            DataSource.returnConnection(con);
        }
    }
    public int update(Member member) {
        Connection con = null;
        PreparedStatement pstmt = null;
        
        try {
            con = DataSource.getConnection();
            pstmt = con.prepareStatement("update ex_memb set name=?,email=?,pwd=password(?) where no=?");
            pstmt.setString(1, member.getName());
            pstmt.setString(2, member.getEmail());
            pstmt.setString(3, member.getPassword());
            pstmt.setInt(4, member.getNo());
            
            return pstmt.executeUpdate();
            
        } catch (Exception e) {
            throw new DaoException();
        } finally {
            try {pstmt.close();} catch (Exception e) {}
            DataSource.returnConnection(con);
        }
    }
    public int delete(int no) {
        Connection con = null;
        PreparedStatement pstmt = null;
        
        try {
            con = DataSource.getConnection();
            pstmt = con.prepareStatement("delete from ex_memb where no=?");
            pstmt.setInt(1, no);
            
            return pstmt.executeUpdate();
            
        } catch (Exception e) {
            throw new DaoException();
        } finally {
            try {pstmt.close();} catch (Exception e) {}
            DataSource.returnConnection(con);
        }
    }
    public Member selectOne(int no) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
            con = DataSource.getConnection();
            pstmt = con.prepareStatement("select no,name,email,regdt from ex_memb where no=?");
            pstmt.setInt(1, no);
            
            rs = pstmt.executeQuery();
            
            Member member = null;
            
            if (rs.next()) {
                member = new Member();
                member.getNo();
                member.getName();
                member.getEmail();
                member.getCreatedDate();
            } 
            rs.close();
            return member;
            
        } catch (Exception e) {
            throw new DaoException();
        } finally {
            try {pstmt.close();} catch (Exception e) {}
            DataSource.returnConnection(con);
        }
    }
    
}
