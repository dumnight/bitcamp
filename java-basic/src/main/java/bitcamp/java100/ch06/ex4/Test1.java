//클래스 멤버와 인스턴스 멤버의 활용
package bitcamp.java100.ch06.ex4;

//1 단계 : 로컬 변수 사용 및 메서드 분리 전
public class Test1 {
    public static void main(String[] args) {
        
        int result = 0;
        
        result = 2 + 5;
        result = result * 3;
        result = result - 7;
        result = result / 2;
        System.out.println(result);
    }
}
