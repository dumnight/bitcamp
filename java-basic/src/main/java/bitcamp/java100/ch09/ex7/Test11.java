// Collection API - HashMap의 값 꺼내기
package bitcamp.java100.ch09.ex7;

import java.util.Collection;
import java.util.HashMap;

public class Test11 {
    
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
        
        //값 목록 얻기
        Collection<Contact> values = map.values(); 
        
        for (Contact c : values) { // key가 뭔지는 모름
            System.out.println(c.toString());
        }
        
        
        
    }
    
}
