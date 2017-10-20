// 클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기
package bitcamp.java100.ch06.ex1;

// 인스턴스를 만들 때 생성자 호출하기
public class Test5 {
    public static void main(String[] args) {
        
        Score4 score;
        //score = new Score4(); 파라미터 값을 받는 생성자 이므로 값이 필요함
        score = new Score4("홍길동", 100, 90, 80); // 호출할 떄 반드시 생성자에 정의된 파라미터의 타입과 개수가
                                                   // 일치해야함
        score.compute();
        
        
        System.out.printf("이름=%s\n", score.name);
        System.out.printf("총점=%d\n", score.sum);
        System.out.printf("평균=%f\n", score.aver);
        
        // score = new Score3;  인스턴트를 만들 떄 생성자()를 호출하지 않음으로 오류
        
        // score = new Score3("홍길동") 생성자를 호출할 때 반드시 그 생성자가 원하는 파라미터 값을 넘겨야 함 
    }
}
