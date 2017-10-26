package practice;
public class Score { 
    String name; 
    int[] subjects = new int[3];
    int sum;
    float aver;
    
        //인스턴스 메서드
    void compute() {
        for(int sub : this.subjects) {
            this.sum += sub;
        }
        this.aver = (float)this.sum / this.subjects.length;
    }
}

