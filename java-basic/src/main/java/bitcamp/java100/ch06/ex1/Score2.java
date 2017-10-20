package bitcamp.java100.ch06.ex1;

//새 데이터를 다루는 연산자를 정의한다
public class Score2 {
    //필드 선언
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    //메서드 선언
    
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
        //인스턴스의 변수를 다루려면 인스턴스의 주소를 알아야 한다.
        //그래서 인스턴스 메서드를 호출할 때는 항상 인스턴스 주소를 준다.
        // 예) 인스턴스주소.메서드명();
        //이렇게 넘겨 받은 인스턴스 주소를 저장한 변수가 this이다.
        //this 변수는 모든 인스턴스 메서드에 내장되어 있다.
        //그리고 이 변수에 인스턴스 주소가 저장되어 있다.
        
        
    }
    
}
