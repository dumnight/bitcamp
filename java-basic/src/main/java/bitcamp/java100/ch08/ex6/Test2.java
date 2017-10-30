//다형성 - hashcode() 오바라이딩 전
package bitcamp.java100.ch08.ex6;

import java.util.ArrayList;
import java.util.HashSet;

public class Test2 {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        
        Score s1 = new Score(1, "홍길동", 100, 100, 100);
        Score s2 = new Score(1, "홍길동", 100, 100, 100);
        
        list.add(s1);
        list.add(s1);
        
        
        System.out.println(list.size());
        
        System.out.println(list.get(0).toString());
        System.out.println(list.get(1).toString());
        
        System.out.println("-----------------------------------------------------------------------------------");
        
        HashSet set = new HashSet();

        set.add(s1);
        set.add(s1);
        
        System.out.println(set.size());
        System.out.println("-----------------------------------------------------------------------------------");
        
        set.add(s2);
        
        System.out.println(set.size());
        System.out.println("-----------------------------------------------------------------------------------");
        
        System.out.printf("s1.equals(s2) = %b\n", s1.equals(s2));
        System.out.printf("s1.hashCode() = %d\n", s1.hashCode());
        System.out.printf("s2.hashCode() = %d\n", s2.hashCode());
        
    }

}
