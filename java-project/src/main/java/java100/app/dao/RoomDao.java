package java100.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import java100.app.App;
import java100.app.domain.Room;
import java100.app.util.DataSource;

public class RoomDao {
    
    
    public List<Room> selectList(){
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            con = DataSource.getConnection();
            pstmt = con.prepareStatement("select no,name,loc,capacity from ex_room");
            rs = pstmt.executeQuery();
            
            ArrayList<Room> list = new ArrayList<>();
            
            while(rs.next()) {
                Room room  = new Room(rs.getString("loc"), rs.getString("name"), rs.getInt("no"), rs.getInt("capacity"));
                list.add(room);
            }
            return list;

        } catch (Exception e) {
            throw new DaoException();
        } finally {
            try {pstmt.close();} catch (Exception e) {}
            DataSource.returnConnection(con);
        }
    }
    
    public int insert(Room room) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DataSource.getConnection();
            pstmt = con.prepareStatement("insert into ex_room(name,loc,capacity) values(?,?,?)");
            pstmt.setString(1, room.getName());
            pstmt.setString(2, room.getLocation());
            pstmt.setInt(3, room.getCapacity());
            
            return pstmt.executeUpdate();  
            
        } catch (Exception e) {
            throw new DaoException();
        } finally {
            try {pstmt.close();} catch (Exception e) {}
            DataSource.returnConnection(con);
        }
    }
    /*
    public int update(Room room) {
        
    }
    */
    public int delete(int no) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DataSource.getConnection();
            pstmt = con.prepareStatement("delete from ex_room where no=?");
            pstmt.setInt(1, no);

            return pstmt.executeUpdate();

        } catch (Exception e) {
            throw new DaoException();
        } finally {
            try {pstmt.close();} catch (Exception e) {}
            DataSource.returnConnection(con);
        }
    }
    /*
    public Room selectOne(int no) {
        
    } */
}
