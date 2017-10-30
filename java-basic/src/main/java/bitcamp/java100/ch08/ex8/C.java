package bitcamp.java100.ch08.ex8;

public class C extends A{
    //리턴 타입만 다른 메서드를 추가할 수 없다
    //호출할 때 파라미터의 타입이나 개수, 순서로 메서드를 찾는데 
    //리턴타입이 다른 경우는 구분할 수 없다
    //메서드를 호출할 때 리턴 값을 반드시 받는것은 아니기 때문
    int m1(int a) {
        System.out.println("int m1(int)");
    }
    
    // 파라미터 타입과 개수, 순서로 호출할 메서드를 구분하기때문에 파라미터 형은 아무런 상관 없다
   
}
