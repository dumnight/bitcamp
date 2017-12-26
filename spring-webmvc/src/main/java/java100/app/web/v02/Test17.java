//요청 핸들러의 파라미터 - @Requestbody II
package java100.app.web.v02;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

@Controller
@RequestMapping("/v02/test17")
public class Test17 {

    //클라이언트가 보낸application/json 데이터를 받아 객체로 만들기
    
    @RequestMapping("/m1")
    public String m1(@RequestBody String json) {
        //JSON문자열 -- > 자바 객체
        
        @SuppressWarnings("rawtypes")
        Map obj = new Gson().fromJson(json, Map.class);
        
        System.out.printf("name=%s\n", obj.get("name"));
        System.out.printf("age=%f\n", obj.get("age"));
        System.out.printf("tel=%s\n", obj.get("tel"));
        System.out.printf("email=%s\n", obj.get("email"));
        
        System.out.println("------------------------");
        return "/hello.jsp";
    }
    
    class User {
        String name;
        int age;
        String tel;
        String email;
    }
    
    @RequestMapping("/m2")
    public String m2(@RequestBody String json) {
        //JSON문자열 -- > 특정 자바 객체
        
        User user = new Gson().fromJson(json, User.class);        
        
        System.out.printf("name=%s\n", user.name);
        System.out.printf("age=%d\n", user.age);
        System.out.printf("tel=%s\n", user.tel);
        System.out.printf("email=%s\n", user.email);
        
        System.out.println("------------------------");
        return "/hello.jsp";
    }
    
    public static class User2 {
        String name;
        int age;
        String tel;
        String email;
        
        public User2() {
           
        }
        
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getTel() {
            return tel;
        }
        public void setTel(String tel) {
            this.tel = tel;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        
        
    }
    
    @RequestMapping(value="/m3")
    public String m3(@RequestBody User2 user) {
        //Spring에서 제공하는 Message Converter를 이용하여 바꾸기
        //JSON문자열을 자동으로 자바 객체로 바꾸기
        //설정이 필요하다.
        //설정 방법
        // 1) JSON 문자열을 자바 객체로 바꿔주는 변환기 등록
        //  - app-servlet.xml 파일에서 RequestMappingHandlerAdapter 객체 참고
        // 2) MVC설정을 활성화시키는 태그나 애노테이션을 사용하여 변환기를 기본으로 등록하기
        //  - 예) Annotation
        //    @Configuration
        //    @EnableWebMvc
        //    public class WebConfig {...}
        //  - 예) 태그
        //    <mvc:annotation-driven/>
        // 이 예제에선 직접 RequestMappingHandlerAdapter에 직접 컨버터를 등록한다.
        
        System.out.printf("name=%s\n", user.name);
        System.out.printf("age=%d\n", user.age);
        System.out.printf("tel=%s\n", user.tel);
        System.out.printf("email=%s\n", user.email);
        
        System.out.println("------------------------");
        return "/hello.jsp";
    }
    
    // HttpMeassageConverter를 등록하면 클라이언트가 보낸 데이터 중에서 
    // application/json 에 대해 자동 변환을 실시하기 때문에 기존에 문자열을 그대로 받으려 할 경우
    // 오류가 발생한다.
    

}
