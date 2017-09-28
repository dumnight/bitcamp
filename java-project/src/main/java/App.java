// ver 0.1
// - 표준 출력장치로 인사문구 출력하기
/*public class App {
  
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}

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


    }
}


    
