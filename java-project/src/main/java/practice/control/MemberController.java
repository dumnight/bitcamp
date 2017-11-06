package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MemberController {
	private ArrayList<Member> list = new ArrayList<>();
	 static Scanner keyScan = new Scanner(System.in);
	 
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
        String email = Prompts.prompt("이메일: ");
        Member member = null;
        Iterator<Member> iterator = list.iterator();
        while(iterator.hasNext()){
            Member temp = iterator.next();
            if(temp.email.equals(email)) {
                member = temp;
                break;
            }
        }
        if(member == null) {
            System.out.printf("%s 의 회원 정보가 없습니다", email);
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
        String email = Prompts.prompt("이메일? ");
        Member member = null;
        Iterator<Member> iterator = list.iterator();
        while(iterator.hasNext()){
            Member temp = iterator.next();
            if(temp.email.equals(email)) {
                member = temp;
                break;
            }
        }
        if(member == null) {
            System.out.printf("%s 는 존재하지 않는 학생정보입니다", email);
        } else {
            member.update();
        }
	}
	public void doView() {
    	System.out.println("학생정보");
        String name = Prompts.prompt("이름: ");
        Member member = null;
        Iterator<Member> iterator = list.iterator();
        while(iterator.hasNext()){
            Member temp = iterator.next();
            if(temp.name.equals(name)) {
                member = temp;
            }
        }
        if(member == null) {
            System.out.printf("%s 는 존재하지 않는 학생정보입니다", name);
        } else {
            member.printDetail();
        }
	}
	public void doList() {
    	System.out.println("회원 목록");
        Iterator<Member> iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.next().print();
        }
	}
	public void doAdd() {
    	System.out.println("회원 등록");
    	Member member = new Member();
    	member.input();
    	
    	boolean isExist = false;
    	Iterator<Member> iterator = list.iterator();
        while(iterator.hasNext()) {
        	if(iterator.next().email.equals(member.email)) {
        		isExist = true;
        		break;
            }
        }
        if(isExist) {
        	System.out.println("이미 등록된 이메일입니다");
        } else {
        	list.add(member);
        }
	}
}
