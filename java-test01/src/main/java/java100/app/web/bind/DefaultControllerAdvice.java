package java100.app.web.bind;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.support.WebBindingInitializer;

//문자열을 특정 타입의 값으로 변환하기
//방법3
//=>WebBindingInitializer 구현체를 만든다
//이 변환기는 XML에 선언해야 한다
@ControllerAdvice // 모든 페이지 컨트롤러에 충고한다
public class DefaultControllerAdvice implements WebBindingInitializer{

    @InitBinder // 요청 핸들러가 호출되기 전에 먼저 실행된다.
    public void initBinder(WebDataBinder binder) {
        //System.out.println("WebBindingInitializer InitBinder()");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false); 
        binder.registerCustomEditor(Date.class,           
                                    new CustomDateEditor(
                                    dateFormat,           
                                    false));           
    
    }
    
}
