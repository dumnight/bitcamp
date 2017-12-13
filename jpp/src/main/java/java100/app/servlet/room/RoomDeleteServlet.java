package java100.app.servlet.room;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.RoomDao;
import java100.app.listener.ContextLoaderListener;

@SuppressWarnings("serial")
@WebServlet(urlPatterns="/room/delete")  // 이 클래스의 객체를 자동 생성해야 함을 표시!
public class RoomDeleteServlet extends HttpServlet {
    
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(RoomDao.class);
        response.setContentType("text/plain;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>강의실관리</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>강의실 삭제 결과</h1>");
        
        try {
            
            int no = Integer.parseInt(request.getParameter("no"));
            
            if (roomDao.delete(no) > 0) {
                out.println("<p>삭제했습니다.</p>");
            } else {
                out.printf("<p>'%d'의 강의실 정보가 없습니다.</p>\n", no); 
            }
            
        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
        out.println("<p><a href='list'>목록</a></p>");
        out.println("</body>");
        out.println("</html>");
    }
    
}










