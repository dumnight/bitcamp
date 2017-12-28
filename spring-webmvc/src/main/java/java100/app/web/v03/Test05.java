//@cookie
package java100.app.web.v03;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v03/test05")
public class Test05 {
    
    //쿠키 보내기
    @RequestMapping(value="/m1", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public Object m1(HttpServletResponse response) {
        
        response.addCookie(new Cookie("name", "hong"));
        response.addCookie(new Cookie("age", "20"));
        return "쿠키 보냄";
    }
    
    //쿠키 받기
    //@CookieValue 애노테이션을 이용하면 특정 쿠키의 값을 받을 수 있다
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public Object m2(@CookieValue("name") String name,
                     @CookieValue("age") int age) {
        
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name=%s\n", name));
        buf.append(String.format("age=%d\n", age));
        
        return buf.toString();
        
    }
    //만약 @CookieValue 에 이름을 지정하지 않으면 변수의 이름을 사용하여 쿠키를 찾는다   
    @RequestMapping(value="/m3", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public Object m3(@CookieValue String name,
                     @CookieValue int age) {
        
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name=%s\n", name));
        buf.append(String.format("age=%d\n", age));
        
        return buf.toString();
        
    }
    //쿠키가 없다면 실행 오류
    @RequestMapping(value="/m4", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public Object m4(@CookieValue String working) {
        
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("working=%s\n", working));
        
        return buf.toString();
        
    }
    
    //required 옵션을 사용하면 쿠키의 값을 선택사항으로 만들 수 있다.
    //기본값은 true이다.
    @RequestMapping(value="/m5", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public Object m5(@CookieValue(required=false) String working) {
        
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("working=%s\n", working));
        
        return buf.toString();
        
    }
    
    //defaultVaule를 설정하면 쿠키 값이 없을때 설정한 값을 사용한다
    @RequestMapping(value="/m6", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public Object m6(@CookieValue(defaultValue="zz") String working) {
        
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("working=%s\n", working));
        
        return buf.toString();
        
    }
    
    
}
