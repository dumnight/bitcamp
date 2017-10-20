// 클래스 문법의 용도 - 사용자 정의 데이터 타입 만들기
package bitcamp.java100.ch06.ex1;

//사용자 정의 데이터 타입 적용 후
public class Test2 {
    public static void main(String[] args) {
        
        //주소를 저장하는 변수 = 레퍼런스
        Score score;
        //준비된 메모리 = 인스턴스 또는 객체
        //new 연산자를 통해 준비된 메모리는 heap에 저장 호출이 끝나도 로컬 변수와 달리 남아있다
        score = new Score();
        
        score.name = "홍길동";
        score.kor = 100;
        score.eng = 100;
        score.math = 100;
        
        // 계산
        score.sum = score.kor + score.eng + score.math;
        score.aver = score.sum / 3f;
        
        
        
    }
}
