
//: - 메서드를 사용하여 반복 코드를 분리한다.
//: 
//: 여러 명의 성적을 저장하고 다음과 같이 출력하라!
//:
//: 출력내용:
//: ```
//: 홍길동, 100,  90,  80, 270,  90.0
//: 임꺽정,  80,  80,  80, 240,  80.0
//: 유관순, 100, 100, 100, 300, 100.0
//: ```
/*
public class App {
    
    static void compute(Score s) {
        for(int sub : s.subjects) {
            s.sum += sub;
        }
        s.aver = s.sum / 3f;
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
            //학생의 성적을 저장할 메모리를 준비한다.
            
            Score[] scores = {new Score(), new Score(), new Score()};
            
            init(scores[0], "홍길동", 200, 500, 423);
            init(scores[1], "홍길동", 200, 500, 423);
            init(scores[2], "홍길동", 200, 500, 423);

                        
                for( Score s : scores) {
                    print(s);
                }
    }
}

*/ 
//ver.09
// 리펙토링을 수행한다.
// 즉 메서드를 관리하기 쉽도록 별도의 클래스로 분류한다.

/*
public class App{
    
    
    public static void main(String[] args) { 
            //학생의 성적을 저장할 메모리를 준비한다.
            
            Score[] scores = {new Score(), new Score(), new Score()};
                Score.init(scores[0], "홍길동", 100, 29, 43);
                Score.init(scores[1], "길동", 100, 29, 43);
                Score.init(scores[2], "동", 100, 29, 43);

                        
                for( Score s : scores) {
                    Score.print(s);
                }
    }
} */


//ver.10
/*
public class App{
    public static void main(String[] args) {
        
        Score[] scores = {
            new Score("홍길동", 100, 129, 143), 
            new Score("길동홍", 122, 129, 543), 
            new Score("동홍길", 100, 429, 143)};
                
        for( Score s : scores) {
            s.print();
        }
        
    }   
} */
//ver.11
/*
public class App{
    
    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println(message);
        String response = keyScan.nextLine().toLowerCase();
        
        if(response.equals("y") || response.equals("yes"))
            return true;
        return false;
        
    }
    
                
    public static void main(String[] args) {
        Score[] scores = new Score[100];
        int cursor = 0;
        
        while(true) {
            Score score = new Score();
            score.input();
            scores[cursor++] = score;
            
         if(!confirm("계속 하시겠습니까?"))
             break;
        }
        for(int i = 0; i < cursor; i++) {
            scores[i].print();
        }
           
        
    }   
} */
//ver.12
/*
public class App{
    
                
    public static void main(String[] args) {
        
        while(true) {
            Score score = new Score();
            ScoreView.input(score);
            ScoreDao.add(score);
            
         if(!MessageBox.confirm("계속 하시겠습니까?"))
             break;
        }
        for(int i = 0; i < ScoreDao.size(); i++) {
            ScoreView.print(ScoreDao.get(i));
        }
           
        
    }   
}*/
//ver 13
public class App{
    
    
    public static void main(String[] args) {
        ScoreDao scoredao = new ScoreDao();
        ScoreView scoreview = new ScoreView();
        
        while(true) {
            Score score = new Score();
            scoreview.input(score);
            scoredao.add(score);
            
         if(!MessageBox.confirm("계속 하시겠습니까?"))
             break;
        }
        for(int i = 0; i < scoredao.size(); i++) {
            scoreview.print(scoredao.get(i));
        }
           
        
    }   
}

