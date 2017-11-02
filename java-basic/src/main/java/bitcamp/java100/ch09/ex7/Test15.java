// Collection API - Iterator
package bitcamp.java100.ch09.ex7;

import java.util.HashMap;
import java.util.Iterator;

public class Test15 {
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
        
        Contact c1 = new Contact("홍길동", "Hong@test.com", "1111-1111");
        Contact c2 = new Contact("홍길동2", "Hong2@test.com", "1111-1112");
        Contact c3 = new Contact("홍길동3", "Hong3@test.com", "1111-1113");
        
        map.put("aaa", c1);
        map.put("bbb", c2);
        map.put("ccc", c3);
        
        //Collection<Contact> values = map.values(); // Contact가 저장된 values
        
        //값이 저장된 목록에서 "데이터를 꺼내주는 일을 할 객체"(Iterator)를 얻는다
        Iterator<Contact> iterator = map.values().iterator();
        //values의 리턴값이 위 Collection values 이기때문에 이렇게 코드를 작성한다
        
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        
    }
    
}
