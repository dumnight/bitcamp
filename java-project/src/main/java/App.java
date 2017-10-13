// ver 0.1
// - 표준 출력장치로 인사문구 출력하기
/*
public class App {
  
    public static void main(String[] args) {
       


// ver 0.2
// - 학생 한 명의 성적 점수를 출력하라
// - 이름, 국어, 영어, 수학, 총점, 평균
// - 예)
//   이름 : 홍길동
//   국어 : 100
//   영어 : 100
//   수학 : 100
//   총점 : 300
//   평균 : 100.0
/*
public class App {
    public static void main(String[] args){
        System.out.print("이름:"); 
        System.out.println("홍길동");
        System.out.print("국어:");
        System.out.println(100);
        System.out.print("영어:");
        System.out.println(100);
        System.out.print("수학:");
        System.out.println(100);
        System.out.print("총점:");
        System.out.println(300);
        System.out.print("평균:");
        System.out.println(100.0);
    }
}
*/

/* ver 0.3
public class App {
    public static void main(String[] args){
    
    String name = "홍길동";

    int kor = 100;
    int eng = 97;
    int math = 98;
    int sum = kor + eng + math;
    float aver = sum / 3.0f;
       
            System.out.printf("이름 : %s\n", name); 
            System.out.printf("국어 : %d\n", kor);
            System.out.printf("영어 : %d\n", eng);
            System.out.printf("수학 : %d\n", math);
            System.out.printf("총점 : %d\n", sum);
            System.out.printf("평균 : %.1f\n", aver);
        
    }


}
*/
/* ver 0.4

public class App {
    public static void main(String[] args){
        String[] names = {"양고기", "닭고기", "소고기"};
        int[] kor = {100, 120, 120};
        int[] eng = {120, 80, 90};
        int[] math = {140, 20, 90};
        
        for(int i=0; i<3; i++){
            int sum = kor + eng + math
            float aver = sum / 3.0f;
            System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", names[i],kor[i],eng[i],math[i],sum,aver);
        }
    }
}

*/
/*
public class App {
    public static void main(String[] args){
        
        class Score{
            String names;
            int kor, eng, math, sum;
            float aver;
        }

        Score r1;
        r1 = new Score();
       
        r1.names = "홍길동";
        r1.kor = 100;
        r1.eng = 98;
        r1.math = 96;
        r1.sum = r1.kor + r1.eng + r1.math;
        r1.aver = r1.sum / 3.0f;

        System.out.printf("%s %d %d %d %d %f\n", r1.names, r1.kor, r1.eng,
        r1.math, r1.sum, r1.aver);
*/
/* ver 0.5
    

*/
/*
public class App {
    public static void main(String[] args) {        
        //학생의 성적을 저장 할 때 사용할 사용자 정의
        //사용자 정의 데이터 타입은 데이터를 저장할 메모리를 설계하는 것이다.
        class Score {
            String name;
            int kor, eng, math, sum;
            float aver;
            
        }
        
        //학생의 성적을 저장할 메모리를 준비한다.
        Score s1 = new Score();
        s1.name = "홍길동";
        s1.kor = 100;
        s1.eng = 90;
        s1.math = 80;
        s1.sum = s1.kor + s1.eng + s1.math;
        s1.aver = s1.sum / 3f;
        Score s2 = new Score();
        s2.name = "임꺽정";
        s2.kor = 80;
        s2.eng = 80;
        s2.math = 80;
        s2.sum = s2.kor + s2.eng + s2.math;
        s2.aver = s2.sum / 3f;
        Score s3 = new Score();
        s3.name = "유관순";
        s3.kor = 100;
        s3.eng = 100;
        s3.math = 100;
        s3.sum = s3.kor + s3.eng + s3.math;
        s3.aver = s3.sum / 3f;

                    
            
            System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.aver);
            System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.aver);
            System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", s3.name, s3.kor, s3.eng, s3.math, s3.sum, s3.aver);
            
            
        }
        

    }
*/
// ver0.6
// 배열 응용 국영 수 성적을 배열에 저장하라
/*
public class App {
    public static void main(String[] args) { 
        class Score {
            String name;
            int[] subjects = new int[3];
            int sum;
            float aver;
        }
            Score s1 = new Score();
            s1.name = "홍길동";
            s1.subjects[0] = 100;
            s1.subjects[1] = 90;
            s1.subjects[2] = 80;
            for(int sub : s1.subjects) {
                s1.sum += sub;
            }
            s1.aver = s1.sum / 3f;
            
            Score s2 = new Score();
            s2.name = "임꺽정";
            s2.subjects[0] = 80;
            s2.subjects[1] = 80;
            s2.subjects[2] = 80;
            for(int sub : s2.subjects) {
                s2.sum += sub;
            }
            s2.aver = s2.sum / 3f;
            
            Score s3 = new Score();
            s3.name = "유관순";
            s3.subjects[0] = 100;
            s3.subjects[1] = 100;
            s3.subjects[2] = 100;
            for(int sub : s3.subjects) {
                s3.sum += sub;
            }
            s3.aver = s3.sum / 3f;

                        
                
                System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", 
                        s1.name, s1.subjects[0], s1.subjects[1], s1.subjects[2], s1.sum, s1.aver);
                System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", 
                        s2.name, s2.subjects[0], s2.subjects[1], s2.subjects[2], s2.sum, s2.aver);
                System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", 
                        s3.name, s3.subjects[0], s3.subjects[1], s3.subjects[2], s3.sum, s3.aver);
                */
                
//ver 0.7
//배열 응용2 
public class App {
    public static void main(String[] args) { 
        class Score {
            String name;
            int[] subjects = new int[3];
            int sum;
            float aver;
        }
            //학생의 성적을 저장할 메모리를 준비한다.
            Score[] scores = new Score[3];
            scores[0] = new Score();
            scores[1] = new Score();
            scores[2] = new Score();
            
            //Score[] scores = {new Score(), new Score(), new Score()};
            
            scores[0].name = "홍길동";
            scores[0].subjects[0] = 100;
            scores[0].subjects[1] = 90;
            scores[0].subjects[2] = 80;
            for(int sub : scores[0].subjects) {
                scores[0].sum += sub;
            }
            scores[0].aver = scores[0].sum / 3f;
            
            scores[1].name = "임꺽정";
            scores[1].subjects[0] = 80;
            scores[1].subjects[1] = 80;
            scores[1].subjects[2] = 80;
            for(int sub : scores[1].subjects) {
                scores[1].sum += sub;
            }
            scores[1].aver = scores[1].sum / 3f;
            
            scores[2].name = "유관순";
            scores[2].subjects[0] = 100;
            scores[2].subjects[1] = 100;
            scores[2].subjects[2] = 100;
            for(int sub : scores[2].subjects) {
                scores[2].sum += sub;
            }
            scores[2].aver = scores[2].sum / 3f;

                        
                for( Score s : scores) {
                System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", 
                        s.name, s.subjects[0], s.subjects[1], s.subjects[2], s.sum, s.aver);
         
                }
    }
        
}

    




    
