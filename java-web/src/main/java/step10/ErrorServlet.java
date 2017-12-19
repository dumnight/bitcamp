package step10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/step10/ErrorServlet")
public class ErrorServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='UTF-8'>");
            out.println("<title>error</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<p>name 파라미터 값이 없습니다</p>");
            out.println("</body>");
            out.println("</html>");
    }
}

/*Redirect의 응답 프로토콜
HTTP/1.1 302
Location: ErrorServlet
Content-Type: text/html;charset=UTF-8
Content-Length: 0
Date: Tue, 19 Dec 2017 02:55:59 GMT*/

//Redirect는 응답할때 어떠한 내용도 보내지 않는다.
//응답 코드 값이 302이다
//Location헤더에 요청할 URL 정보가 있다










