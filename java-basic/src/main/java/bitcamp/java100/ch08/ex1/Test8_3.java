//캡슐화 활용 - 셋터의 등장
package bitcamp.java100.ch08.ex1;


class Score3 {
    String name;
    private int kor;
    private int eng;
    private int math;
    private int sum;
    private float aver;
    
    public void setKor(int kor) {
        this.kor = kor;
        this.compute();
    }
    public int getKor() {
        return this.kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
        this.compute();
    }
    public int getEng() {
        return this.eng;
    }

    public void setMath(int math) {
        this.math = math;
        this.compute();
    }
    public int getMath() {
        return this.math;
    }

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
    


public class Test8_3 {
    
    public static void main(String[] args) {
        Score3 s = new Score3();
        
        s.name = "홍길동";
        
        //변수에 값을 직접 넣지 않고 메서드를 통해 넣는다면 그 메서드 내부에서 작업을 수행
        //이것이 셋터를 만드는 이유이다
        s.setKor(100);
        s.setEng(90);
        s.setMath(80); 
        
        System.out.printf("%s, %d, %d, %d, %d, %f\n",
                s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());

        s.setEng(50);
        
        System.out.printf("%s, %d, %d, %d, %d, %f\n",
                s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());

        
    }

}
    