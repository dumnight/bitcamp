package practice.control;

import java.util.Iterator;

import practice.domain.Score;
import practice.util.Prompts;

public class ScoreController extends GenericController<Score> {
	
	@Override
	public void execute() {
		loop:
		while(true) {
			System.out.print("성적관리> ");
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
    	System.out.println("성적삭제");
        String name = Prompts.inputString("이름: ");
        Score score = findByName(name);
        if(score == null) {
            System.out.printf("%s 는 존재하지 않는 학생정보입니다", name);
        } else {
        	if(Prompts.confirm2("정말 삭제하시겠습니까?(y/N)")) {
        		list.remove(score);
        		System.out.println("삭제하였습니다");
        	} else {
        		System.out.println("삭제를 취소하였습니다");
        }
	}
	}
	private void doUpdate() {
    	System.out.println("학생정보변경");
        String name = Prompts.inputString("이름: ");
        Score score = findByName(name);
        
        if(score == null) {
            System.out.printf("%s 는 존재하지 않는 학생정보입니다\n", name);
        } else {
            int kor = score.getKor();
            try {
                kor = Prompts.inputInt("국어(%d)", score.getKor());
            } catch(Exception e) {}
            int eng = score.getEng();
            try {
                eng = Prompts.inputInt("영어(%d)", score.getEng());
            } catch(Exception e) {}
            int math = score.getMath();
            try {
                math = Prompts.inputInt("수학(%d)", score.getMath());
            } catch(Exception e) {}  
             
            if(Prompts.confirm2("변경하시겠습니까? y/N")) {
                score.setKor(kor);
                score.setEng(eng);
                score.setMath(math);
                System.out.println("변경되었습니다");
            } else {
                System.out.println("변경 취소");
            }
        }
	}
	private void doView() {
    	System.out.println("학생정보");
        String name = Prompts.inputString("이름: ");
        Score score = findByName(name);
        
        if(score == null) {
            System.out.printf("%s 는 존재하지 않는 학생정보입니다\n", name);
        } 
        	System.out.printf("%-4s, %4d, %4d, %4d, %4d, %6.1f\n",  
                    score.getName(),
                    score.getKor(),
                    score.getEng(),
                    score.getMath(),
                    score.getSum(), 
                    score.getAver());
        
	}
	private void doList() {
    	System.out.println("성적목록");
        Iterator<Score> iterator = list.iterator();
        while(iterator.hasNext()) {
        	Score score = iterator.next();
                System.out.printf("%-4s, %4d, %6.1f\n",  
                        score.getName(), 
                        score.getSum(), 
                        score.getAver());
        }
	}
	private void doAdd() {
    	System.out.println("성적 등록");
            Score score = new Score();
            
            score.setName(Prompts.inputString("이름? "));
            score.setKor(Prompts.inputInt("국어? "));
            score.setEng(Prompts.inputInt("영어? "));
            score.setMath(Prompts.inputInt("수학? "));
            
            list.add(score);
        
	}
	private Score findByName(String name) {
		Iterator<Score> iterator = list.iterator();
        while(iterator.hasNext()){
            Score score = iterator.next();
            if(score.getName().equals(name)) {
                return score;
            }
        }
        return null;
	}
}
