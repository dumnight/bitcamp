package step10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/step10/Servlet01")
public class Servlet01 extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
            String name = req.getParameter("name");
            if (name == null) {
                // 클라이언트에게 ErrorServlet을 요청하라고 응답한다.
                // 상대 경로이기 때문에 실제 경로는 다음과 같다.
                // http://localhost:9999/java-web/step10/ErrorServlet
                res.sendRedirect("ErrorServlet");
                return;
            }
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<title>redirect</title>");
            out.println("</head>");
            out.println("<body>");
            out.printf("<p>%s 님 환영 합니다</p>", name);
            out.println("</body>");
            out.println("</html>");
    }
}
