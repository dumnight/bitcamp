//Session 다루기 - 세션 무효화
package java100.app.web.v03;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/v03/test08")
@SessionAttributes({"name","age"})
public class Test08 {
    
    //일부 값은 Model 객체를 통해 간접적으로 세션에 보관하고, 
    //일부 값은 직접 세션 객체에 보관하기
    @RequestMapping(value="/m1")
    public String m1(HttpSession session, Model model) {

        //Model에 저장하면 그 값들은 ServletRequest에 자동 보관된다.
        model.addAttribute("name", "홍길"); //Session에도 보관된다.
        model.addAttribute("age", 20);      //Session에도 보관된다.
        model.addAttribute("working", true); // 직접 Session에 보관할 것이다
        
        session.setAttribute("working", true);
        
        
        return "v03/test08/m1";
    }
    //세션 무효화
    @RequestMapping(value="/m2")
    public String m2(HttpSession session) {

       session.invalidate();
       //invalidate()로 세션을 무효화 시킨 경우
       //=> 세션을 새로 만든다
       //=> @SessionAttributes에 지정한 값을 다시 새로 만든 세션에 보관한다.
       //   (내부적으로 @SessionAttributes에 지정한 값을 별도의 메모리에 관리 하기 때문에
       //    이것이 가능하다)
       
       //세션을 무효화 한 후 보관소에 저장한 값을 확인 
       return "v03/test08/m1";
    }
    
    //세션 무효화 II
    @RequestMapping(value="/m3")
    public String m3(SessionStatus status) {

       status.setComplete();
       //setComplete()을 호출하면, @SessionAttributes 로 지정된 값만 제거한다.

       return "v03/test08/m1";
    }
    
    //세션 무효화 III
    @RequestMapping(value="/m4")
    public String m5(HttpSession session, SessionStatus status) {

       session.invalidate();  //session.setAttributes()로 추가한 값 모두 제거
       status.setComplete();  //@SessionAttributes()로 지정한 값 모두 제거
       //setComplete()을 호출하면, @SessionAttributes 로 지정된 값만 제거한다.

       return "v03/test08/m1";
    }
}
