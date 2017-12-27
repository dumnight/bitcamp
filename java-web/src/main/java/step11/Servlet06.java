//쿠키(cookie)의 사용 기간 지정하기
//브라우져를 종료해도 지정 기간동안은 존재한다.
package step11;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/step11/Servlet06")
public class Servlet06 extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        //사용 기간을 지정하지 않을 경우
        res.addCookie(new Cookie("name", "hong"));
        
        //사용 기간을 30초 지정할 경우
        Cookie cookie = new Cookie("age", "20");
        cookie.setMaxAge(30);
        res.addCookie(cookie);

        //사용 기간을 1분으로 지정할 경우
        cookie = new Cookie("working", "true");
        cookie.setMaxAge(60);
        res.addCookie(cookie);
        
        
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("쿠키를 보냄");
        
    }
}
