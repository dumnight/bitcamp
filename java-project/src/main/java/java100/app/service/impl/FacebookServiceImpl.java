package java100.app.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java100.app.service.FacebookService;

@Service
public class FacebookServiceImpl implements FacebookService {

    @SuppressWarnings("rawtypes")
    @Override
    public <T> T me(String accessToken, Class<T> type) {
        // 클라이언트가 보낸 액세스 토큰을 가지고 
        // 페이스북 서버에 로그인 사용자 정보를 요청한다.
        RestTemplate restTemplate = new RestTemplate();
        
        try {
            return restTemplate.getForObject(
                 
                    "https://graph.facebook.com/v2.12/me?access_token={v1}&fields={v2}",
                    
                    type,
                    
                    accessToken, "id,name,email");
            
            
        } catch (Exception e) {
            throw new RuntimeException("페이스북 Graph API 실행 오류!", e);
        }
    }
    
}
