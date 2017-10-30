//다형성 - hashcode() 오바라이딩 전
package bitcamp.java100.ch08.ex6;

public class Score {
    protected int count = 0;
    protected int no;
    protected String name;
    protected int kor;
    protected int eng;
    protected int math;
    protected int sum;
    protected float aver;
    
    public Score() {
    }
    
    public Score(int no, String name, int kor, int eng, int math) {
        this.no = ++count;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.compute(); 
       
    }
    
    @Override
    public String toString() {
        return "Score [count=" + count + ", no=" + no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", math="
                + math + ", sum=" + sum + ", aver=" + aver + "]";
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Score other = (Score) obj;
        if (count != other.count)
            return false;
        if (eng != other.eng)
            return false;
        if (kor != other.kor)
            return false;
        if (math != other.math)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (no != other.no)
            return false;
        return true;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
        this.compute();
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
        this.compute();
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
        this.compute();
    }

    public int getSum() {
        return sum;
    }

    public float getAver() {
        return aver;
    }
    
    protected void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }
    
    
    
    
}
