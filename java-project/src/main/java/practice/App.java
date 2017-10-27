package practice;

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
        
       // Score[] scores = new Score[100];
        //int cursor = 0;
        
        ArrayList list = new ArrayList();
        
        while(true) {
            Score score = new Score();
            score.input();
            list.add(score);
       //     scores[cursor++] = score;
            if(!confirm("계속하냐?")) 
                break;
            
        }
        for(int i = 0; i < list.size(); i++) {
            //Score s = (Score)list.get(i);
            //s.print();
            ((Score)list.get(i)).print();
           
        }
            
        
    }
}