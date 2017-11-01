// Collection API - HashSet II
package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

public class Test5 {
    static class Contact {
        String name;
        String email;
        String tel;
    
    public Contact (String name, String email, String tel) {
        this.name = name;
        this.email = email;
        this.tel = tel;
        }
    }
    public static void main(String[] args) {
        
        HashSet<String> set = new HashSet<>();
        
        Contact c1 = new Contact("홍길동", "Hong@test.com", "1111-1111");
        Contact c2 = new Contact("홍길동", "Hong@test.com", "1111-1111");
        Contact c3 = new Contact("홍길동", "Hong@test.com", "1111-1111");
        
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);
        System.out.println(c2 == c3);
        
        
        
        
/*        String s1 = "홍길동";
        String s2 = "임꺽정";
        String s3 = "유관순";
        
        set.add(s1);
        set.add(s2);
        set.add(s3);
        
        //집합의 특징을 구현했기 때문에 같은 인스턴스를 중복 저장할 수 없다
        set.add(s1);
        set.add(s2);
        set.add(s3);
        
        //null 값 또한 중복 저장할 수 없다
        set.add(null);
        set.add(null);

        System.out.println(set.size());
        
        String[] arr = new String[set.size()];
        String[] arr2 =  set.toArray(arr);
        
        
        if(arr == arr2)
            System.out.println("arr == arr2");
        else
            System.out.println("arr != arr2");
        
        for (String s : arr) {
            System.out.printf("%s ", s);
        }
            System.out.println(); 
        */
    }
    
}
