package step3;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//@WebFilter(urlPatterns="/step3/*") 애노테이션 배치
//scr/main/webapp/WEB-INF/web.xml DD파일 배치
public class Filter02 implements javax.servlet.Filter {
    
    FilterConfig config;
    
    public void init(javax.servlet.FilterConfig filterConfig) throws javax.servlet.ServletException {
        System.out.println("Filter02.init()");
        this.config = filterConfig;
    }
    @Override
    public void destroy() {
        System.out.println("Filter02.destroy()");
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        System.out.println("Filter02.doFilter() - before");
                
        chain.doFilter(request, response); //다음 필터나 서블릿을 실행
        
        System.out.println("Filter02.doFilter() - after");
    }
}
