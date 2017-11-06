package practice.control;

import java.util.Iterator;

import practice.domain.Member;
import practice.util.Prompts;

public class MemberController extends GenericController<Member>{
	@Override
	public void execute() {
		loop:
		while(true) {
			System.out.print("회원관리> ");
		  	String input = keyScan.nextLine();
		          
		  		switch (input) {
				case "add": doAdd();break;
				case "list": doList(); break;
				case "view": doView(); break;
				case "update": doUpdate(); break;
				case "delete": doDelete(); break;
				case "main": break loop;
				default: 
					System.out.println("해당 명령이 없습니다");
	  		}
		}
	}
	private void doDelete() {
    	System.out.println("회원삭제");
        String email = Prompts.inputString("이메일: ");
        Member member = findByEmail(email);
        if(member == null) {
            System.out.printf("%s 의 회원 정보가 없습니다\n", email);
        } else {
        	if(Prompts.confirm2("정말 삭제하시겠습니까?(y/N)")) {
        		list.remove(member);
        		System.out.println("삭제하였습니다");
        	} else {
        		System.out.println("삭제를 취소하였습니다");
        }
	}
	}
	public void doUpdate() {
    	System.out.println("회원정보변경");
        String email = Prompts.inputString("이메일? ");
        Member member = findByEmail(email);
        if(member == null) {
            System.out.printf("%s 는 존재하지 않는 회원정보입니다", email);
            return;
        } 
                String name = Prompts.inputString("이름 (%s)", member.getName());
                if(name.isEmpty()) {
                	name = member.getName();
                }
                String password = Prompts.inputString("암호 ");
                if(password.isEmpty()) {
                	password = member.getPassword();
                }
                
                if(Prompts.confirm2("변경하시겠습니까? y/N")) {
                	member.setName(name);
                	member.setPassword(password);
                    System.out.println("변경되었습니다");
                } else {
                    System.out.println("변경 취소");
                }
                
        
	}
	public void doView() {
    	System.out.println("회원 정보");
        String email = Prompts.inputString("이름: ");
        Member member = findByEmail(email);
        
        if(member == null) {
            System.out.printf("%s 는 존재하지 않는 회원정보입니다", email);
            return;
        } 
          	System.out.printf("이름 :%s\n", member.getName());
           	System.out.printf("이메일 :%s\n", member.getEmail());
           	System.out.printf("암호 :%s\n", member.getPassword());
                
        
	}
	public void doList() {
    	System.out.println("회원 목록");
        Iterator<Member> iterator = list.iterator();
        while(iterator.hasNext()) {
        	Member member = iterator.next();
        	System.out.printf("이름 :%s\n", member.getName());
        	System.out.printf("이메일 :%s\n", member.getEmail());
        }
	}
	public void doAdd() {
    	System.out.println("회원 등록");
    	Member member = new Member();
    	member.setEmail(Prompts.inputString("이메일 ?"));
    	
        if(findByEmail(member.getEmail()) != null) {
        	System.out.println("이미 등록된 이메일입니다");
        	return;
        } 
        	member.setName(Prompts.inputString("이름 "));
        	member.setPassword(Prompts.inputString("암호 "));
        	list.add(member);
        
	}
	private Member findByEmail(String email) {
		Iterator<Member> iterator = list.iterator();
        while(iterator.hasNext()){
            Member member = iterator.next();
            if(member.getEmail().equals(email)) {
                return member;
            }
        }
        return null;
	}
}
