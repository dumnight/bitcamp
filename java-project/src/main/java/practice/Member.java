//: ## 캡슐화 적용
//: - 모든 필드에 대해 외부 접근을 차단한다.
//:   단 자식 클래스에서는 직접 접근할 수 있게 허락한다.
//: 
package practice;
import java.util.Scanner;

public class Member {  
    
    protected String name;
    protected String email;
    protected String password;

    //: ### 생성자
    //: > 다른 패키지에서도 호출할 수 있도록 public으로 공개한다.
    public Member() {
    }
    
    public Member(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", email=" + email + ", password=" + password + "]";
	}

	public void print() {
    	System.out.printf("이름 :%s\n", this.name);
    	System.out.printf("이메일 :%s\n", this.name);
    }
    
    public void input() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("이름? ");
        this.name = keyScan.nextLine();
        
        System.out.print("이메일 ");
        this.email = keyScan.nextLine();
        
        System.out.print("암호 ");
        this.password = keyScan.nextLine();
        
    }
    
    public void update() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.printf("이름 (%s)", this.name);
        String name = keyScan.nextLine();
        if(name.isEmpty()) {
        	name = this.name;
        }
        System.out.printf("암호 (%s)", this.password);
        String password = keyScan.nextLine();
        if(name.isEmpty()) {
        	name = this.name;
        }
        
        if(Prompts.confirm2("변경하시겠습니까? y/N")) {
        	this.name = name;
        	this.password = password;
            System.out.println("변경되었습니다");
        } else {
            System.out.println("변경 취소");
        }
        
    }

    public void printDetail() {
    	System.out.printf("이름 :%s\n", this.name);
    	System.out.printf("이메일 :%s\n", this.email);
    	System.out.printf("암호 :%s\n", this.password);
        
    }
}
