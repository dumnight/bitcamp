//Session 다루기 - @SessionAttributes
package java100.app.web.v03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/v03/test07")

// @SessionAttributes에 이름을 지정하면 요청이 들어올 때 다음과 같이 동작한다.
// => 요청 핸들러의 호출이 끝났을 때,
// 1) 요청 핸들러에서 Model 객체에 그 이름으로 값을 보관했을 경우,
//  -Model 객체에 보관된 값은 모두 ServletRequest 보관소에 복사를 한다 
//  -@SessionAttributes에 지정된 값은 또한 HttpSession 보관소에도 복사한다.
// 2) 요청 핸들러에서 Model 객체에 그 이름으로 값을 보관하지 않았을 경우,
//  -HttpSession 객체에 그 이름으로 이미 값이 보관되어 있다면 ServletRequest 보관소에도 복사한다.

// Model 객체에 보관되는 값은 프론트 컨트롤러가 JSP를 실행하기 전에
// ServletRequest 보관소에 복사를 하는데
// 다음 애노테이션에 지정된 값은 세션 보관소에도 복사한다.
@SessionAttributes({"name","age"})
public class Test07 {
    
    //세션에 저장하고 싶은 값이 있으면
    //Map/Model 객체에 담는다
    @RequestMapping(value="/m1")
    public String m1(Model model) {
        
        //프론트 컨트롤라가 준 Model객체에 값을 저장하면 
        //이 값은 ServletRequest 저장소에 보관된다
        //만약 Model에 저장되는 값의 이름이 
        //클래스 선언부에 붙인 @SessionAttributes에 설정되어 있다면
        //그 값은 HttpSession 객체에 보관된다
        model.addAttribute("name", "홍길"); 
        model.addAttribute("age", 20); 
        model.addAttribute("working", true);
        
        //
        return "v03/test07/m1";
    }
    //@ModelAttribute를 이용하여 세션에 보관된 값 꺼내기
    @RequestMapping(value="/m2", produces="text/plain;charset=UTF-8")
    @ResponseBody //객체가 아니라 클라이언트에 직접 출력할 데이터임을 알리기위해 표기
    public String m2(@ModelAttribute("name") String name,
                    @ModelAttribute("age") int age) {
        
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name=%s\n", name));
        buf.append(String.format("age=%d\n", age));
        
        return buf.toString();
    }
    
    //@ModelAttribute의 이름을 생략
    @RequestMapping(value="/m3", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m3(
                    //ModelAttribute의 경우 이름을 생략할 수 없다. 실행 오류
                    @ModelAttribute String name,
                    @ModelAttribute int age) {
        
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("name=%s\n", name));
        buf.append(String.format("age=%d\n", age));
        
        return buf.toString();
    }
    
    //@ModelAttribute에서 세션에 지정되지 않은 값을 호출할 때
    //오류는 나지않지만 빈문자열이 출력된다
    @RequestMapping(value="/m4", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m4(
                    @ModelAttribute("working") String working) {
        
        StringBuffer buf = new StringBuffer();
        buf.append(String.format("working=%s\n", working));
        
        return buf.toString();
    }
    
    //요청 핸들러의 호출이 끝난 후 프론트 컨트롤러는 Model 객체에 
    //@SessionAttributes에서 지정한 값이 없는지 조사한다.
    // => 있다면 , 그 값을 HttpSession에 보관소에 저장한다.
    // => Model 객체에는 없는데 HttpSession객체에 기존에 그 이름으로 보관된 값이 있다면
    //    , 세션 보관소에 기존에 저장된 값을 JSP에서 사용하기 위해 ServletRequest에 담아준다. 
   
    @RequestMapping(value="/m5")
    public String m5(HttpSession session) {
        
       session.invalidate();
       
       return "v03/test07/m1";
    }
}
