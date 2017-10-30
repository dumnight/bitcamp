package bitcamp.java100.ch08.ex4;

public class Test2 {

    public static void main(String[] args) {
        Score2 s1 = new Score2(1, "홍길동", 100, 100, 100);
        Score2 s2 = new Score2(2, "홍길동", 100, 100, 100);
        
        if(s1 != s2)
            System.out.println("s1과 s2는 주소가 다르다");
        
        if(s1.equals(s2))
            System.out.println("s1과 s2의 내용은 같다");
        //Score 클래스에 대하 equals를 호출하는 것은 
        //Score의 수퍼 클래스인 Object의 equals를 호출하는 것이다
        //Objects의 equals는 원래 같은 인스턴스인지를 검사한다
        
        
    }

}
