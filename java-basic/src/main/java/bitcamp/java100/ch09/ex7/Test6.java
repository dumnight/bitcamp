// Collection API - HashSet II
package bitcamp.java100.ch09.ex7;

import java.util.HashSet;

public class Test6 {
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
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((tel == null) ? 0 : tel.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contact other = (Contact) obj;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (tel == null) {
            if (other.tel != null)
                return false;
        } else if (!tel.equals(other.tel))
            return false;
        return true;
    }

    
    }
    public static void main(String[] args) {
        
        HashSet<Contact> set = new HashSet<>();
        
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
