package bitcamp.java100.ch06.ex1;

// 한 클래스에 여러개의 생성자를 정의할 수 있다
public class Score5 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    //파라미터 없는 생성자
    Score5 () {
        System.out.println("Score5 호출됨");
        
        this.name = "홍길동";
        this.kor = 50;
        this.eng = 50;
        this.math = 50;
        
        this.compute();
    }
    //파라미터 있는 생성자
    Score5(String name){
        System.out.println("Score5(String) 호출됨");
        this.name = name;
    }
    //파라미터 있는 생성자
    Score5 (String name, int kor, int eng, int math) {
        System.out.println("Score5(String int int int)호출됨");
        
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        
        this.compute();
        
    }
    
    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
        
        
    }
    
}
