//쿠키(cookie) 값으로 한글을 사용하기
package step11;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/step11/Servlet07")
public class Servlet07 extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        //쿠키 이름을 한글로 작성할 경우,
        //res.addCookie(new Cookie("이름", "hong")); 오류 발생
        
        //쿠키 값을 한글로 작성할 경우
        //=>보내지지만, UTF-8 형식으로 전달된다.
        //HTTP 응답 헤더에 UTF-8 형식의 다국어 코드를 작성하지 말도록 권고하고있다
        //문제는 네트웤 장비 중에 8비트를 처리하지 못하는 경우 데이터가 손실될 수 있다.
        res.addCookie(new Cookie("name", URLEncoder.encode("ABC123홍길동","UTF-8")));
        //URLEncoder.encode("홍길동","UTF-8")의 동작과정
        //유니코드 2바이트로 된 홍길동을 UTF-8형식으로 변환한다
        
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("쿠키를 보냄");
        
    }
}
