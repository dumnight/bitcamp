package practice;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

import java100.app.control.GenericController;
import java100.app.domain.Score;
import java100.app.util.Prompts;

public class ScoreController extends GenericController<Score> {
	
	public ScoreController() {
		this.init();
	}
	@Override
    public void destroy() {
    	try (FileWriter out = new FileWriter("./date/score.csv");) {
    		for(Score score : this.list) {
    		out.write(String.format("s, %s, %d, %d, %d, %f\n", 
    				score.getName(), score.getKor(), score.getEng(), score.getMath(), score.getSum(), score.getAver()));
    		}
    	} catch(IOException e) {
    		e.printStackTrace();
    	} 
    }
    @Override
    public void init() {
    	try ( 
    		FileReader in = new FileReader("./data/score.csv");
    		Scanner lineScan = new Scanner(in);)
    	{
    		 String str = null;
    		 while(lineScan.hasNextLine()) {
    			 str = lineScan.nextLine();
    			 String[] rec = str.split(",");
    			 if(rec.length != 6) // 데이터의 개수가 올바르지ㅣ 않다면 건너뛴다 
    				 continue;
    			 
    			 Score score = new Score(rec[0], 
    					 Integer.parseInt(rec[1]), Integer.parseInt(rec[2]), Integer.parseInt(rec[3]));
    			 list.add(score);
    			 
    		 }
    		 
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
	
	@Override
    public void execute() {
        loop:
            while (true) {
                System.out.print("성적관리> ");
                String input = keyScan.nextLine();
                switch (input) { 
                case "add": this.doAdd(); break; 
                case "list": this.doList(); break;           
                case "view": this.doView(); break;
                case "update": this.doUpdate(); break;
                case "delete": this.doDelete(); break;
                case "main": break loop;
                default: 
                    System.out.println("해당 명령이 없습니다");
                }
                System.out.println();
            }
    }
    
    private void doDelete() {
        System.out.println("[학생 삭제]");
        String name = Prompts.inputString("이름? ");
        Score score = findByName(name);
        
        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {
            if (Prompts.confirm2("정말 삭제하시겠습니까?(y/N) ")) {
                list.remove(score);
                System.out.println("삭제하였습니다.");
            } else {
                System.out.println("삭제를 취소하였습니다.");
            }
        }
        
    }
    private void doUpdate() {
        System.out.println("[학생 정보 변경]");
        String name = Prompts.inputString("이름? ");
        Score score = findByName(name);
        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
        } else {
            
            int kor = score.getKor();
            try {
                kor = Prompts.inputInt("국어? (%d)", score.getKor()); 
            } catch(Exception e) {}
            
            int eng = score.getEng();
            try {
                eng = Prompts.inputInt("영어? (%d)", score.getEng());
            } catch(Exception e) {}
            
            int math = score.getMath();
            try {
                math = Prompts.inputInt("수학? (%d)", score.getMath());
            } catch(Exception e) {}
            
            if(Prompts.confirm2("변경하시겠습니까? (y/N) ")) {
                score.setKor(kor);
                score.setEng(eng);
                score.setMath(math);
                System.out.println("변경하였습니다.");
                
            } else {
                System.out.println("변경을 취소하였습니다");
            }
        }
    }
    private void doView() {
        System.out.println("[학생 정보]");
        String name = Prompts.inputString("이름? ");
        Score score =  findByName(name);
        if (score == null) {
            System.out.printf("'%s'의 성적 정보가 없습니다.\n", name);
            return;
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
        System.out.println("[학생 목록]");
        Iterator<Score> iterator = list.iterator();
        while (iterator.hasNext()) {
        	Score score = iterator.next();
        	System.out.printf("%-4s, %4d, %6.1f\n",  
                    score.getName(), 
                    score.getSum(), 
                    score.getAver());
        }
        
    }
    private void doAdd() {
        System.out.println("[학생 등록]");
        
     	Score score = new Score();
            
            score.setName(Prompts.inputString("이름? "));
            score.setKor(Integer.parseInt(Prompts.inputString("국어? ")));
            score.setEng(Integer.parseInt(Prompts.inputString("영어? ")));
            score.setMath(Integer.parseInt(Prompts.inputString("수학? ")));
            list.add(score);
    }
    
    private Score findByName(String name) {
    	Iterator<Score> iterator = list.iterator();
        while (iterator.hasNext()) {
            Score score = iterator.next();
            if (score.getName().equals(name)) {
            	return score;
            }
        }
        return null;
    }

}
