//캡슐화 활용 - 접근 제한 하기 
package bitcamp.java100.ch08.ex1;


class Score2 {
    String name;
    int kor;
    int eng;
    int math;
    
    private int sum;
    private float aver;
    
    public void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
    
    public int getSum() {
        return this.sum;
    }
    public float getAver() {
        return this.aver;
    }
    
    
    
}
    


public class Test8_2 {
    
    public static void main(String[] args) {
        Score2 s = new Score2();
        
        s.name = "홍길동";
        s.kor = 100;
        s.eng = 90;
        s.math = 80;
        // sum에 직접 값을 넣는것을 막기위해 접근제어 문법을 사용한다
        //s.sum = 280;
        //s.aver = s.sum / 3f;
        s.compute();
        
        System.out.printf("%s, %d, %d, %d, %d, %f\n",
                s.name, s.kor, s.eng, s.math, s.getSum(), s.getAver());

        // 값을 바꿀 경우
        s.eng  = 50;
        // 다시 계산해야 한다
        // 값을 바꿀 때 자동으로 계산 하게 하는 방법은 아직 없다
        // 이럴경우를 위해 셋터를 만든다
        s.compute();
        
        
        
    }

}
    