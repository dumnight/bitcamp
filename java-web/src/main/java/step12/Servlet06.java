//세션(session) - 요청과 요청 사이에 데이터 공유하기 II
//=> 클라이언트가 요청한 작업을 수행한 후 그 결과를 서버에 보관하는 방법
package step12;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
@WebServlet("/step12/Servlet06")
public class Servlet06 extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        //세션을 무효화 시키는 방법
        //1) 클라이언트 쪽에서 모든 웹브라우저를 닫기
        // - 모든 웹브라우저가 종료되면 메모리에 보관되어 있는 쿠키값들이 모두 제거된다.
        // - 세션 아이디는 사용 기간이 지정되지 않았기 때문에 메모리에 보관된다
        // - 따라서 모든 웹브라우저를 닫으면 세션아이디도 잃게 된다.
        // - 그러면 다음에 웹브라우저가 서버에 요청할 때 세션아이디를 보낼 수 없기 때문에
        //   서버 입장에서는 새로 HttpSession을 만들 수 밖에 없다.
        HttpSession session = req.getSession();
        session.invalidate(); // 세션을 무효화 하라
        
        res.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = res.getWriter();
        out.println("세션을 무효화함");
    }
}
