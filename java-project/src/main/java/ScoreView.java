import java.util.Scanner;

public class ScoreView {
    void print(Score score) {
        System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n", 
                score.name, score.subjects[0], score.subjects[1], score.subjects[2], score.sum, score.aver);
    }
    void input(Score score) {
        Scanner keyScan = new Scanner(System.in); 
        System.out.print("이름 :");
        score.name = keyScan.nextLine();
        System.out.print("국어 : ");
        score.subjects[0] = keyScan.nextInt();
        System.out.print("영어 : ");
        score.subjects[1] = keyScan.nextInt();
        System.out.print("수학 : ");
        score.subjects[2] = keyScan.nextInt();
        score.compute();
    }


}
