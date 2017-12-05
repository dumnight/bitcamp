//: ## ver 48
//: - Spring IoC 컨테이너를 사용하여 객체 관리(Bean Container) 및 
//:   의존 객체 주입(DI)을 자동화하라!
//: - 학습목표
//:   - Spring IoC 컨테이너의 설정 및 사용방법을 익힌다.
//:   - Spring IoC 컨테이너의 역할을 이해한다.
//:   
package java100.app;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java100.app.util.DataSource;

// 기존 방식의 문제점
// - 객체 관리 및 의존 객체 주입 기능이 단순하다. 
// - 외부 파일을 이용한 객체 관리 뿐만아니라 애노테이션을 이용한 객체 관리 
//   방법을 모두 제공하고 싶다. 
//
// 해결 방안
// - 이미 검증되고 널리 사용되는(best practice) 오픈 소스를 활용하여 
//   객체 관리와 의존 객체 주입을 자동화 하자!
// - Spring IoC 컨테이너를 도입하여 처리한다.
// - 변경코드  
//   0) 오픈 소스 Spring IoC 컨테이너 라이브러리를 다운로드 받는다. 
//      => mvnrepository.com에서 spring-context 라이브러리를 찾는다.
//      => build.gradle에 의존 라이브러리 정보를 등록한다.
//      => "gradlew eclipse"를 실행하여 이클립스 설정 파일을 갱신한다. 
//      => 이클립스 프로젝트를 "Refresh" 한다.
//
//   1) App 클래스 변경
//      => 우리가 만든 ApplicationContext 대신에 Spring의 ApplicationContext를
//         사용한다.
//      => 스프링에서 규정한 방식에 맞춰 설정 관련 애노테이션을 붙인다.
//
//   2) 컨트롤러와 DAO 클래스 변경 
//      => 우리가 만든 @Component 애노테이션 대신 
//         스프링에서 제공하는 @Component 애노테이션으로 바꾼다.
//
//   3) 의존 객체를 주입받으려면 셋터에 @Autowired 또는 @Inject를 붙여라!
//      => 컨트롤러에서는 DAO를 주입받는 셋터에 붙여라!
//      => DAO에서는 DataSource를 주입받는 셋터에 붙여라!
//  
//   4) @Autowired를 셋터에 붙이는 대신 필드에 직접 붙여라!
//      => 셋터에 붙이지 않고 필드에 붙여도 된다.
//      => 그러면 셋터는 지워도 된다.
//
// Spring IoC 컨테이너 = Bean Container + Dependency Injection
// => AnnotationConfigApplicationContext
//    - 애노테이션을 이용하여 클래스에 설정 정보를 붙인다.

// => ClassPathXmlApplicationContext
//    - 설정 정보를 XML 파일에 저장한다.
//    - 설정 정보가 들어 있는 XML 파일이 자바 클래스 경로에 놓여 있다.
//
// => FileSystemXmlApplicationContext
//    - 설정 정보를 XML 파일에 저장한다.
//    - 설정 정보가 들어 있는 XML 파일이 기타 임의의 위치에 놓여 있다.
//
@WebServlet(urlPatterns="/init", name="AppInitServlet", loadOnStartup=1)
@Configuration 
@ComponentScan("java100.app") 

public class AppInitServlet implements Servlet {

    ServletConfig servletConfig;
    
    public static AnnotationConfigApplicationContext iocContainer;
    
    // 스프링 IoC 컨테이너에게 getDataSource() 메서드를 호출해서
    // 이 메서드가 리턴한 객체를 꼭 컨테이너에 보관해달고 표시!
    @Bean 
    DataSource getDataSource() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/studydb");
        ds.setUsername("study");
        ds.setPassword("1111");
        return ds;
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("AppInitServlet.init()");
        this.servletConfig = config;
        
        iocContainer = new AnnotationConfigApplicationContext(AppInitServlet.class);
    }
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("AppInitServlet.service()");
    }
    
    @Override
    public void destroy() {
        System.out.println("AppInitServlet.destroy()");
        DataSource ds = iocContainer.getBean(DataSource.class);
        ds.close();
    }
    
    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }
    
    @Override
    public String getServletInfo() {
        return "이 서블린은 다른 서블릿을 위한 스프링 IoC 컨테이너를 준비한다.";
    }
    
}















