//클래스 멤버와 인스턴스 멤버의 활용
package bitcamp.java100.ch06.ex4;

//3 단계 : static 변수 사용
public class Test3 {
    
    static int result;
    //
    
    //계산 결과는 static 변수 result에 저장하기 때문에 리턴할 필요가 없다
    static void plus(int value) {result += value;}
    static void minus(int value) {result -= value;}
    static void multiple(int value) {result *= value;}
    static void divide(int value) {result /= value;}
    
    public static void main(String[] args) {
        
        plus(2);
        plus(5);
        multiple(3);
        minus(7);
        divide(2);
        //메서드가 계산한 결과를 저장하기 위해 변수를 선언할 필요가 없다
        
        System.out.println(result);
    }
}
