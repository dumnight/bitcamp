//요청 핸들러의 리턴값 - 클라이언트로 바로 콘텐츠 리턴하기
package java100.app.web.v03;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/v03/test02")
public class Test02 {

    //@ResponseBody을 붙이면 리턴 값을 콘텐츠로 간주하게 된다
    @RequestMapping("/m1")
    @ResponseBody
    public String m1() {
        return "hello"; // 리턴 값을 클라이언트로 그대로 출력된다.
        
    }
    
    //한글 출력
    @RequestMapping("/m2")
    @ResponseBody
    public String m2(HttpServletResponse response) {
        // 콘텐츠를 출력할 때 기본으로 ISO-8859-1로 character set으로 인코딩하기 때문에
        // 한글을 출력하면 바꿀 수 없다는 의미로 ?로 출력된다.
        
        //리턴하기 전에 콘텐츠 타입의 문자집합 설정 => 안됨
        response.setContentType("text/plain;charset=UTF-8");
        
        //직접 응답 헤더 설정 => 안됨
        response.setHeader("Content-Type", "text/plain;charset=UTF-8");
        //이유=> 프론트 컨트롤러에서 Content-Type의 헤더를 설정하기 때문
        
        return "ㅎ호"; 
        
    }
    
    //한글 출력II
    //=>다음 메서드는 클라이언트가 text/plain MIME 타입의 데이터를 요구하고 또한 그 데이터가 
    //  UTF-8로 인코딩 되길 원할 때 호출되는 메서드이다.
    //=>그런데 프론트 컨트롤러가 리턴 값을 출력할 때 이 조건을 분석하여 설정된 MIME 타입의
    //  문자집합으로 인코딩한다. 따라서 한글이 안깨지는것이다.
    //=>단 다른 조건이 붙을 때 문자집합이 처리되지 않는 상황이 발생할 수 있다.
    @RequestMapping(value="/m3", produces="text/plain;charset=UTF-8")
    @ResponseBody
    public String m3() { 
        
        return "ㅎ호"; 
        
    }

    //클라이언트에 출력될 데이터를 객체에 담아서 리턴하기
    @RequestMapping(value="/m4")
    //@ResponseBody // HttpEntity나 ResponseEntity 객체를 리턴할 떄는 프론트 컨트롤러가 콘텐츠임을
                  // 알 수 있기 때문에 @ResponseBody를 붙일 필요가 없다.
    public HttpEntity<String> m4() {
        
        //클라이언트에 보낼 데이터에 대한 부가 정보를 설정한다
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        
        //클라이언트로 보낼 콘텐츠를 담을 객체를 준비한다.
        HttpEntity<String> entity = new HttpEntity<>("한글", headers);
        return entity;  
        
    }
    
    //클라이언트에 출력될 데이터를 객체에 담아서 리턴하기 II
    @RequestMapping(value="/m5")
    public HttpEntity<String> m5() {
        
        
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "text/plain;charset=UTF-8");
        
        ResponseEntity<String> entity = new ResponseEntity<>("한글", headers, HttpStatus.OK);
        return entity;  
        
    }
    
    //기타 객체 리턴하기
     
    @RequestMapping(value="/m6")
    @ResponseBody
    public Object m6() {
        //만약 리턴 값이 일반 자바 객체라면, messageConverter에 등록된 변환기가 가동되어 
        //JSON 형식의 문자열로 바뀌어 출력된다.
        return new Member("홍길동", 20, true);
    }
}
