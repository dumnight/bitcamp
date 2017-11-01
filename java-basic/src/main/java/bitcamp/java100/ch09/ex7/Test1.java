// Collection API - Arraylist
// Arraylist - 데이터를 중복 저장하는걸 허락한다
package bitcamp.java100.ch09.ex7;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        
        list.add(new String("홍길동"));
        list.add(new String("임꺽정"));
        list.add(new String("유관순"));
        
        System.out.println(list.size());
        
        for(int i = 0; i < list.size(); i++) {
            System.out.printf("%s ", list.get(i));
        }
        System.out.println();
        
        //컬렉션에서 값을 꺼낼때 다른 형식의 for문을 사용할 수 있다
        //특정범위만 꺼낼 수 없다 순차적으로 꺼내기 때문
        for (String s : list) { // 제네릭을 사용안할시 for(Object s: list) 
            System.out.printf("%s ", s); //내부적으로 list.get(i)가 실행된다
        }
        System.out.println();
        
    }
}
