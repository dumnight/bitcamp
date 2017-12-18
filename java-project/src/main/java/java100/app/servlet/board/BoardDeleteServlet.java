package java100.app.servlet.board;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java100.app.listener.ContextLoaderListener;
import java100.app.domain.Board;
import java100.app.dao.BoardDao;

@WebServlet("/board/delete")
@SuppressWarnings("serial")
public class BoardDeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
        List<Board> list = boardDao.selectList();
        
        int no = Integer.parseInt(request.getParameter("no"));
        int count = boardDao.delete(no);
        
        request.setAttribute("count", count);
        
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher rd = request.getRequestDispatcher("/board/delete.jsp");
        rd.include(request, response);
        
    }
}
