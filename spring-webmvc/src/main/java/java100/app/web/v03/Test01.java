//요청 핸들러의 리턴값
package java100.app.web.v03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v03/test01")
public class Test01 {

    // View 컴포넌트 URL
    // 프론트 컨트롤러는 요청 핸들러가 리턴하는 Servlet/JSP를 실행 한다.
    @RequestMapping("/m1")
    public String m1() {
        //스프링에 기본 설정된 viewResolver를 사용할 경우에는 
        //다음과 같이 전체 JSP URL 정보를 정확하게 리턴해야 된다.
        //return "/hello.jsp";
        
        //만약 기본 ViewResolver를 다른 것으로 교체하였다면, 그 리졸버의 규칙에 따라 리턴한다.
        return "v03/test01/m1";
        
    }

    // 값을 리턴하지 않는 경우
    // 실행할 뷰 컴포넌트(서블릿/JSP)의 URL이 자동으로 계산된다
    // =>view url = 현재 요청한 URL의 디렉토리 이름 + 현재 요청한 URL
    // 예) http://localhost:9999/spring-webmvc/app/v02/test18/m2 라고 요청한다면
    // =>view url = /app/v02/test18 + /app/v02/test18/m2 = /app/v02/test18/app/v02/test18/m2
    // 따라서 URL을 정확하게 명시하지 않으면 현재 URL을 기준으로 자동으로 JSP(서블릿일 수도 있음)
    // URL을 결정하기 때문에 우리가 원하는 경로를 가리키지 못하게 된다.
    // 그러므로 스프링에 원래 설치되어 있는 뷰를 실행하는 객체(ViewResolver)를 다른 더 적절한 객체로
    // 교체해야 한다.
    
    // => view url = prefix + 요청 핸들러의 url + postfix 
    //      = / + /v03/test01/m2 + .jsp
    //      = /v03/test01/m2.jsp (앞에 이중으로 붙은 /는 제거된다.)
    @RequestMapping("/m2")
    public void m2() {
        System.out.println("Test01.m2()...");
    }
}
