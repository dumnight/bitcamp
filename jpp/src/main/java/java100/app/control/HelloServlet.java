package java100.app.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/hello/*")  // 이 클래스의 객체를 자동 생성해야 함을 표시!
public class HelloServlet implements Servlet {
    
    ServletConfig servletConfig;
    
    @Override
    public void destroy() {}
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.servletConfig = config;
    }
    
    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }
    
    @Override
    public String getServletInfo() {
        return "인사관리 서블릿";
    }
    
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        
        HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpServletResponse httpResponse = (HttpServletResponse) res;
        
        httpResponse.setContentType("text/plain;charset=UTF-8");
        
        switch (httpRequest.getPathInfo()) {
        case "/hi": this.doHi(httpRequest, httpResponse); break;
        case "/hi2": this.doHi2(httpRequest, httpResponse); break;
        default: 
            res.getWriter().println("해당 명령이 없습니다.");
        }
    }
    
    private void doHi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        out.println("하이루~~~");
    }
    
    private void doHi2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        PrintWriter out = response.getWriter();
        out.println("오호라... 안녕!");
        
    } 
}










