// Collection API - HashMap의 값 꺼내기
package bitcamp.java100.ch09.ex7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Test12 {
    
    static class Contact {
        String name;
        String email;
        String tel;
    
    public Contact (String name, String email, String tel) {
        this.name = name;
        this.email = email;
        this.tel = tel;
        }

    @Override
    public String toString() {
        return "Contact [name=" + name + ", email=" + email + ", tel=" + tel + "]";
    }
    
    
    }
    public static void main(String[] args) {
        
        HashMap<String, Contact> map = new HashMap<>();
        
        map.put("c01",new Contact("홍길동", "Hong@test.com", "1111-1111"));
        map.put("c02",new Contact("홍길동2", "Hong@test.com", "1111-1111"));
        map.put("c03",new Contact("홍길동3", "Hong@test.com", "1111-1111"));
        map.put("c04",new Contact("홍길동4", "Hong@test.com", "1111-1111"));
        map.put("c05",new Contact("홍길동5", "Hong@test.com", "1111-1111"));
        
        //key와 value를 한쌍으로 묶은 목록 얻기
        // Entry = Map에 속한 중첩클래스
        Set<Entry<String, Contact>> entrySet = map.entrySet(); 
        //map안에 contact와 string이 있기때문에 받는쪽에서도 정확한 레퍼런스 타입을 선언해야 한다
        
        for (Entry<String, Contact> entry : entrySet) { // key가 뭔지는 모름
            String key = entry.getKey();
            Contact contact = entry.getValue();
            System.out.printf("%s= %s\n", key ,contact.name);
        }
        
        
        
    }
    
}
