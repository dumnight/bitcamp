//캡슐화 활용 - 메서드를 private로
package bitcamp.java100.ch08.ex1;


class Score4 {
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
    
    //메서드는 보통 외부에서 사용할 수 있도록 공개하는데
    //다음 메서드처럼 내부에서만 사용하는 메서드가 있다
    //이럴 경우 굳이 공개할 필요가 없다
    //객체지향의 핵심은 관련된 여러 기능들을 한 클래스에 묶어 놓고(캡슐화)
    //외부에서 사용할 수 있도록 일부 기능만 노출하는 것이 중요하다
    //그것이 캡슐화의 핵심
    private void compute() {
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
    


public class Test8_4 {
    
    public static void main(String[] args) {
        Score4 s = new Score4();
        
        s.name = "홍길동";
        
        //변수에 값을 직접 넣지 않고 메서드를 통해 넣는다면 그 메서드 내부에서 작업을 수행
        //이것이 셋터를 만드는 이유이다
        s.setKor(100);
        s.setEng(90);
        s.setMath(80); 
        
        //세터를 호출하여 값을 저장할 때 내부에서 compute()를 자동으로 호출한다
        //그러나 다음과 같이 명시적으로 호출해도 오류는 아니다
        //이런경우 쓸데없이 호출하지 않도록 막는 것이 좋다
        //외부 노출을 최소화 시키는것이 유지보수에 좋다
        //s.compute(); 
        
        System.out.printf("%s, %d, %d, %d, %d, %f\n",
                s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());

        s.setEng(50);
        
        System.out.printf("%s, %d, %d, %d, %d, %f\n",
                s.name, s.getKor(), s.getEng(), s.getMath(), s.getSum(), s.getAver());

        
    }

}
    