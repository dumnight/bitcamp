package java100.app.ex16;

import java.util.Scanner;
 
public class App {
    
    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println(message);
        String response = keyScan.nextLine().toLowerCase();
        
        if(response.equals("y") || response.equals("yes"))
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        //제네릭이 적용된 ArrayList를 사용
        ArrayList<Score> list = new ArrayList();
        
        while (true) {
            Score score = new Score(); // 성적 데이터를 저장할 빈 객체를 준비한다.
            score.input(); // 사용자로부터 입력받은 데이터를 빈 객체에 저장한다.
            
            list.add(score);

            if (!confirm("계속하시겠습니까? "))
                break;
        }
        
        for (int i = 0; i < list.size(); i++) {
            //ArrayList에 어떤 값을 저장할 지 알려줬기 때문에 값을 꺼낼때 따로 형변환 할 필요가 없다
            //((Score)list.get(i)).print();
            (list.get(i)).print();
        }
    }
}
