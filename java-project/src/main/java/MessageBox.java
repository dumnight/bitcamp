import java.util.Scanner;

public class MessageBox {
    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.println(message);
        String response = keyScan.nextLine().toLowerCase();
        
        if(response.equals("y") || response.equals("yes")) {
            return true;
        }
        return false;
        
    }
    
}
