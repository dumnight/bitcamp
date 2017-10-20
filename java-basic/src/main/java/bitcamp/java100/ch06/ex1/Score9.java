package bitcamp.java100.ch06.ex1;

// 인스턴스 초기화 블록
public class Score9 {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
    
    //인스턴스 초기화 블록 정의
    {
        System.out.println("인스턴스 초기화 블록 실행111");
    }
    
    Score9(){
        System.out.println("Score9() 호출됨");
    }
    
    
    Score9(String name){
        System.out.println("Score9(String) 호출됨");
    }
    {
        System.out.println("인스턴스 초기화 블록 실행222");
    }
    
    void compute() {
        //일반 인스턴스 메서드에서 생성자를 호출할 수 없다
        //오직 new 명령으로 인스턴스를 생성할 때만 호출할 수 있다.
        // this(); 컴파일 오류 
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
    
    {
        System.out.println("인스턴스 초기화 블록 실행333");
    }
    
    
}
