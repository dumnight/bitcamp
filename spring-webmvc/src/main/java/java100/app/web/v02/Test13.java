//요청 핸들러의 파라미터 - 파일 업로드
package java100.app.web.v02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/v02/test13")
public class Test13 {
    
    //클라이언트가 멀티비트 형식으로 보낸 데이터를 처리한다
    
    @RequestMapping
    public String fileupload(
            String name,
            int age,
            boolean working,
            MultipartFile photo) {
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(working);
        System.out.println(photo.getOriginalFilename());
        
        return "/hello.jsp";
    }
}
