//요청 핸들러의 파라미터 - @Requestbody
package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v02/test16")
public class Test16 {

    //URL에 값을 포함하여 전달하고 꺼내는 방법
    
    @RequestMapping("/m1")
    public String m1(@RequestBody String body) {
        System.out.println(body);
        System.out.println("------------------------");
        return "/hello.jsp";
    }
    
    @RequestMapping("/m2")
    public String m2(@RequestBody String body) {
        System.out.println(body);
        System.out.println("------------------------");
        return "/hello.jsp";
    }
    
    @RequestMapping("/m3")
    public String m3(@RequestBody String body) {
        System.out.println(body);
        System.out.println("------------------------");
        return "/hello.jsp";
    }
    
    @RequestMapping("/m4")
    public String m4(@RequestBody String body) {
        System.out.println(body);
        System.out.println("------------------------");
        return "/hello.jsp";
    }
    

}