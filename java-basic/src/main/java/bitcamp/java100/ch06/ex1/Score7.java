package bitcamp.java100.ch06.ex1;

// 기본 생성자
public class Score7 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    Score7() {
        this("홍길동");
        /*
        this.name = "홍길동";
        this.kor = 50;
        this.eng = 50;
        this.math = 50;
        this.compute(); */
    }
    
    Score7(String name){

        this(name, 50, 50, 50);
        /*
        this.name = name;
        this.kor = 50;
        this.eng = 50;
        this.math = 50; 
        this.compute();*/
    }
    
    Score7(String name, int kor, int eng, int math){
        
        
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.compute();
    }
    
    void compute() {
        //일반 인스턴스 메서드에서 생성자를 호출할 수 없다
        //오직 new 명령으로 인스턴스를 생성할 때만 호출할 수 있다.
        // this(); 컴파일 오류 
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
        
        
    }
    
}
