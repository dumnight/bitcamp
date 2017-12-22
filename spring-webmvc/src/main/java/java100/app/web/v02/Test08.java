package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test08")
public class Test08 {
    
    
    // Accept 요청 헤더
    //=>HTTP 클라이언트가 요구하는 콘텐츠의 MIME 타입
    //=>produces 속성에 MIME 타입을 지정하면 된다

    @RequestMapping(produces="text/csv")
    public String m1() {
        System.out.println("m1()");
        return "/hello.jsp";
    }
    @RequestMapping(produces="application/json")
    public String m2() {
        System.out.println("m2()");
        return "/hello.jsp";
    }
    @RequestMapping
    public String m3() {
        System.out.println("m3()");
        return "/hello.jsp";
    }
}
