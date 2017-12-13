package java100.app.servlet.score;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java100.app.dao.ScoreDao;
import java100.app.listener.ContextLoaderListener;

@WebServlet(urlPatterns="/score/delete")
@SuppressWarnings("serial")
public class ScoreDeleteServlet extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {

        ScoreDao scoreDao = ContextLoaderListener.iocContainer.getBean(ScoreDao.class);
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>성적관리</title>");
        out.println("<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>");
        out.println("<style>");
        out.println(".container{");
        out.println("   width: 680px");
        out.println("}");
        out.println("</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class='container'>");
        out.println("<h1>성적 삭제</h1>");

        try {
            int no = Integer.parseInt(request.getParameter("no"));

            if (scoreDao.delete(no) > 0) {
                out.println("<p>삭제했습니다.</p>");
            } else {
                out.printf("<p>'%d'의 성적 정보가 없습니다.</p>\n", no);
            }

        } catch (Exception e) {
            e.printStackTrace(); // for developer
            out.println(e.getMessage()); // for user
        }
        out.println("<p><a href='list' class='btn btn-primary btn-sm'>목록</a></p>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }

   
}
