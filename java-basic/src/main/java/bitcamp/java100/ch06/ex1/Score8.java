package bitcamp.java100.ch06.ex1;

// this의 생략
public class Score8 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    
    Score8(String name){
        //변수 앞에 this가 없으면 로컬 변수인지 찾아본다.
        this.name = name;
        //로컬 변수에 그런 이름을 가진 변수가 없다면 컴파일러는 인스턴스변수 인지 찾고  
        //인스턴스 변수라면 this를 자동으로 붙인다. 인스턴스 변수가 아니라면 당연히 오류.
        kor = 50;
        eng = 50;
        math = 50;
        
        compute();
    }
    
    void compute() {
        //일반 인스턴스 메서드에서 생성자를 호출할 수 없다
        //오직 new 명령으로 인스턴스를 생성할 때만 호출할 수 있다.
        // this(); 컴파일 오류 
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
        
        
    }
    
}
