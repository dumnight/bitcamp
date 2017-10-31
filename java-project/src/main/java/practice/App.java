package practice;

public class App {
    
    static void compute(Score score) {
        for (int sub : score.subjects) {
            score.sum += sub;
        }
        score.aver = score.sum / 3f;
    }
    
    static void print(Score score) {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                score.name, score.subjects[0], score.subjects[1], score.subjects[2], score.sum, score.aver);
    
    }
    
    static void init(Score score, String name, int kor, int eng, int math) {
        score.name = name;
        score.subjects[0] = kor;
        score.subjects[1] = eng;
        score.subjects[2] = math;
        
        compute(score);
    }
    
    public static void main(String[] args) {
       
        
        //: 학생의 성적을 저장할 메모리를 준비한다.
        /*
        Score[] scores = new Score[3];
        scores[0] = new Score();
        scores[1] = new Score();
        scores[2] = new Score();
        */
        
        Score[] scores = {new Score(), new Score(), new Score()};
        
        init(scores[0], "홍길동", 100, 20, 80);
        init(scores[1], "가나다", 70, 10, 50);
        init(scores[2], "으으으", 30, 30, 90);
        
        //: 학생 성적을 출력한다.
        for (Score s : scores) {
            print(s);
        }
    }
}