package java100.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet(urlPatterns="/hello/*")
public class HelloServlet extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {

        response.setContentType("text/plain;charset=UTF-8");
        
        switch (request.getPathInfo()) {
        case "/hi":
            this.doHi(request, response);
            break;
        case "/hi2":
            this.doHi2(request, response);
            break;
        default:
            response.getWriter().println("해당 명령이 없습니다.");
        }
    }

    private void doHi(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("하이1");
    }

    private void doHi2(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        out.println("하이2");

    }

}
