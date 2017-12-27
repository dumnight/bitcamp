//세션(session) - 요청과 요청 사이에 데이터 공유하기
//=> 클라이언트가 요청한 작업을 수행한 후 그 결과를 서버에 보관하는 방법
package step12;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@SuppressWarnings("serial")
@WebServlet("/step12/Servlet03")
public class Servlet03 extends HttpServlet {
    
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        
        req.setCharacterEncoding("UTF-8");
        //세션 객체를 준비
        HttpSession session = req.getSession();
            
        //클라이언트가 보낸 파라미터 값을 세션 보관소에 저장한다.
        String name = req.getParameter("name");
        session.setAttribute("name", name);
        
        RequestDispatcher rd = req.getRequestDispatcher("/step12/form2.jsp");
        rd.forward(req, res);
        
            
    }
}
