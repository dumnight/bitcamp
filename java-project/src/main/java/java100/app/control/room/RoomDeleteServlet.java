package java100.app.control.room;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java100.app.annotation.RequestMapping;
import java100.app.dao.RoomDao;
import java100.app.domain.Room;

@Component("/room/delete")
public class RoomDeleteServlet {

    @Autowired RoomDao roomDao;
    
    @RequestMapping
    public String delete(Room room, HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        roomDao.delete(room.getNo());

        return "redirect:list.do";
        
    }
}
