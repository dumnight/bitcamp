//상속 - Object 클래스의 주요 메서드
package bitcamp.java100.ch07.ex4;

public class Test2 {
    
    
    public static void main(String[] args) {
        Test2 obj = new Test2();
        
        //인스턴스에 대해 간단한 정보를 문자열로 리턴한다
        System.out.println(obj.toString());
       
        //인스턴스마다 고유의 해시값을 리턴한다
        System.out.println(Integer.toHexString(obj.hashCode()));
        
        //인스턴스가 같은지 비교하여 true 또는 false값을 리턴하다
        
        Test2 obj2 = new Test2();
        Test2 obj3 = obj;
        
        System.out.println(obj.equals(obj2));
        System.out.println(obj.equals(obj3));
        System.out.println("---------------------------");
        //equals() 메서드를 재정의한 대표적인 클래스
        // String와 wrapper클래스(byte, short, Integer, Long...)
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1 == s2);  // 인스턴스를 비교
        System.out.println(s1.equals(s2)); // 내용이 같으면 같음
        
        System.out.println("---------------------------");
        //StringBuffer는 equals()를 재정의 하지않아서 Object의 equals()를 그대로 사용한다.
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("hello");
        System.out.println(sb1 == sb2); 
        System.out.println(sb1.equals(sb2)); // 내용이 같
        
        //인스턴스의 클래스 정보(를 담은 인스턴스의 주소)를 리턴한다.
        
        Class c = obj.getClass();
        System.out.println(c.getName());
        
    }

   
}
