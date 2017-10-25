//ver.13
//ScoreDao 클래스의 스태틱 멤버를 인스턴스 멤버로 전환하라
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

//ver.12
//Score 객체의 주소를 저장하고 꺼내는 코드를 별도의 클래스로 분리
//클래스를 분류하는 과정을 이해하고 연습한다
/*
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
//ver.11
//키보드로부터 성적 정보를 입력받아 저장하라
//계속 저장할지 지 여부를 물어봐라
//저장을 완료하면 모든 성적을 출력하라
/*
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
            void print() {
                System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", 
                        this.name, this.subjects[0], this.subjects[1], this.subjects[2], this.sum, this.aver);
            }
            void input() {
                Scanner keyScan = new Scanner(System.in); 
                System.out.print("이름 :");
                this.name = keyScan.nextLine();
                System.out.print("국어 : ");
                this.subjects[0] = keyScan.nextInt();
                System.out.print("영어 : ");
                this.subjects[1] = keyScan.nextInt();
                System.out.print("수학 : ");
                this.subjects[2] = keyScan.nextInt();
                this.compute();
            }

    }
*/


//ver.10
//생성자를 이용하여 인스턴스를 초기화 시켜라 , 인스턴스를 다루는 메서드는 인스턴스 메서드로 전환하라
/*
public class Score { 
            String name; 
            int[] subjects;
            int sum;
            float aver;
            
            // 생성자
            Score(String name, int kor, int eng, int math) {
                this.name = name;
                this.subjects = new int[] {kor, eng, math};
                this.compute();
            }
            //인스턴스 메서드
            void compute() {
                for(int sub : this.subjects) {
                    this.sum += sub;
                }
                this.aver = (float)this.sum / this.subjects.length;
            }
            void print() {
                System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", 
                        this.name, this.subjects[0], this.subjects[1], this.subjects[2], this.sum, this.aver);
            }
           void init(Score score, String name, int kor, int eng, int math) {
               score.name = name;
               score.subjects[0] = kor;
               score.subjects[1] = eng;
               score.subjects[2] = math;
               
               compute();
           }

    }


*/

//클래스의 용도
//다음 Score 클래스는 성적 데이터를 저장할 메모리를 설계하는 것과 함께 그 설계도에 따라서 생성된 메모리의 값을
//다루는 메서드도 갖고 있다.
// 사용자 데이터 타입을 정의 하는 것과 메서드를 분류 하는 것을 동시에 하는 경우가 많다.
/*
public class Score { 
            // ### 메모리 설계도
            // new 명령을 사용하여 메모리를 만들 때 어떤 메모리를 준비해야 하는지 정의하는 명령
            // new Score() new 명령어를 만날시 수행됨
            String name; 
            int[] subjects = new int[3]; 
            int sum;
            float aver;
            //### 메서드 분류
            //Score 메모리의 값을 다루는 메서드는 Score 클래스에 두는 것이 더 유지보수에 도움이 된다
            static void compute(Score score) {
                for(int sub : score.subjects) {
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

    }
*/
/* 
public class App {

//: 합계와 평균을 계산하는 코드를 다음과 같이 별도의 메서드로 분리한다.
static void compute(Score score) {
    for (int sub : score.subjects) {
        score.sum += sub;
    }
    score.aver = score.sum / 3f;
}

//: 성적 데이터를 출력하는 코드를 별도의 메서드로 분리한다.
static void print(Score score) {
    System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
            score.name, 
            score.subjects[0], 
            score.subjects[1], 
            score.subjects[2], 
            score.sum, 
            score.aver);
}

//: 성적 데이터를 메모리에 저장하는 코드를 별도의 메서드로 분리한다.
static void init(Score score, String name, int kor, int eng, int math) {
    score.name = name;
    score.subjects[0] = kor;
    score.subjects[1] = eng;
    score.subjects[2] = math;
    
    //: 성적 데이터를 저장한 김에 바로 계산을 수행하자! 
    compute(score);
}


public static void main(String[] args) {
    
    Score[] scores = {new Score(), new Score(), new Score()};
    
    init(scores[0], "홍길동", 100, 90, 80);
    init(scores[1], "임꺽정", 80, 80, 80);
    init(scores[2], "유관순", 100, 100, 100);
    
    //: 학생 성적을 출력한다.
    for (Score s : scores) {
        print(s);
    }
    
}
} */