package java100.app.ex21;

import java.util.Scanner;

public class Member {  
    
    protected String name;
    protected String email;
    protected String pwd;
    

    //: ### 생성자
    //: > 다른 패키지에서도 호출할 수 있도록 public으로 공개한다.
    public Member() {
     
    }
    
    public Member(String name, String email, String pwd) {
        this.name = name;
        this.email = email;
        this.pwd = pwd;
    }
    
    public void print() {
        System.out.printf("%-4s, %4s\n", this.name,this.email);
    }
    
    public void input() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("이름? ");
        this.name = keyScan.nextLine();
        System.out.print("이메일? ");
        this.email = keyScan.nextLine();
        System.out.print("암호? ");
        this.pwd = keyScan.nextLine();
        
    }
    public void update() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.printf("이름? (%s)", this.name);
        String name = keyScan.nextLine();
        if(name.isEmpty()) {
            name = this.name;
        }
        
        System.out.printf("이메일? (%s)", this.email);
        String email = keyScan.nextLine();
        if(email.isEmpty()) {
            email = this.name;
        }
        
        System.out.printf("암호? (%s)", this.pwd);
        String pwd = keyScan.nextLine();
        if(pwd.isEmpty()) {
            pwd = this.name;
        }
        
        if(Prompts.confirm2("변경하시겠습니까? (y/N) ")) {
            this.name = name;
            this.email = email;
            this.pwd = pwd;
            System.out.println("변경하였습니다.");
            
        } else {
            System.out.println("변경을 취소하였습니다");
        }
        
        
    }
    
    public void printDetail() {
        System.out.printf("이름  :%s\n이메일:%4s\n암호  :%4s\n",  
                this.name,
                this.email, 
                this.pwd);
        
    }
}
