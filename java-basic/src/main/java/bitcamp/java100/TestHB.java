package bitcamp.java100;

import java.io.Console;

public class TestHB{
    public static void main(String[] args) {
    
    Console console = System.console();
    
    
    class staa {
        String name;
        String email;
        String num;
         staa(String a, String b, String c){
             this.name = a;
             this.email = b;
             this.num = c;
         }
    }
    
    staa[] aa = new staa[3];
    String s1, s2;
    
    for(int i = 0; i < aa.length; i++) {
        aa[i] = new staa(console.readLine("이름:"), console.readLine("이메일:"), console.readLine("전화번호:"));
        s1 = console.readLine("저장하시겠습니까? y/n");
        if(s1.equals("n")) {
            //aa[i] = new staa(console.readLine("비어있음"),console.readLine("비어있음"), console.readLine("비어있음"));
            System.out.println("저장을 취소하셨습니다.");
        } else if(s1.equals("y")) {
            System.out.println("저장하였습니다");
        }
        
        
        s2 = console.readLine("계속 하시겠습니까? y/n");
        if(s2.equals("n")) {
            System.exit(1);
        }
    }
    System.out.println(aa[0].name +"    "+ aa[0].email +" "+ aa[0].num);
    System.out.println(aa[1].name +"    "+ aa[1].email +" "+ aa[1].num);
    System.out.println(aa[2].name +"    "+ aa[2].email +" "+ aa[2].num);
    }
}