//캡슐화 활용 - 접근 제한 하기 전
package bitcamp.java100.ch08.ex1;


class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
}
    


public class Test8_1 {
    
    public static void main(String[] args) {
        Score s = new Score();
        
        s.name = "홍길동";
        s.kor = 100;
        s.eng = 90;
        s.math = 80;
        // sum에 직접 값을 넣는것을 막기위해 접근제어 문법을 사용한다
        s.sum = 280;
        s.aver = s.sum / 3f;
        
        System.out.printf("%s, %d, %d, %d, %d, %f\n",
                s.name, s.kor, s.eng, s.math, s.sum, s.aver);
        
    }

}
    