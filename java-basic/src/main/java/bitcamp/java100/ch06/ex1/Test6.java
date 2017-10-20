// 클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기
package bitcamp.java100.ch06.ex1;

// 여러개의 생성자 중에서 한 개를 선택하기
public class Test6 {
    public static void main(String[] args) {
        
        Score5 score;
        
        // 생성자가 여러개일 경우 파라미터 값으로 호출할 생성자를 결정
        score =  new Score5();
        score = new Score5("임꺽정",100, 100, 100);
        score = new Score5("유관순");
        
        //score  = new Score5(100, 100, 100); 주어진 파라미터 값을 받는 생성자를 찾을 수 없음으로 오류
        
        score.compute();
        
        
    }
}
