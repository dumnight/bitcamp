package step10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/step10/Servlet02")
public class Servlet02 extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
            String name = req.getParameter("name");
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<title>redirect</title>");
            out.println("</head>");
            out.println("<body>");
            if (name == null) {
                // 3초 후에 다른 페이지를 요청하라고, 응답헤더를 추가한다
                // 웹 브라우져는 이 응답헤더를 받으면 3초후에 다시 지정한 페이지를 요청한다.
                res.setHeader("Refresh", "3;url=ErrorServlet");
                out.println("실행 오류! (3초후에 페이지 이동)");
            } else {
                out.printf("<p>%s 님 환영 합니다</p>", name);
            }
            out.println("</body>");
            out.println("</html>");
    }
}

//요청을 받았을 때 뭔가 출력한 후에 다른 페이지로 보내고 싶다면 refresh
//요청을 받았을 때 출력 없이 바로 다른 페이지로 보내고 싶다면 redirect
