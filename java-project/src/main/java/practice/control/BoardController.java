package practice.control;

import java.sql.Date;
import java.util.Iterator;

import practice.domain.Board;
import practice.util.Prompts;

public class BoardController extends GenericController<Board> {
	
	@Override
	public void execute() {
		loop:
		while(true) {
			System.out.print("게시판> ");
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
	public void doDelete() {
    	System.out.println("게시물 삭제");
        int no = Prompts.inputInt("번호: ");
        Board board = findByNo(no);
        if(board == null) {
            System.out.printf("%s 는 존재하지 않는 학생정보입니다", no);
        } else {
        	if(Prompts.confirm2("정말 삭제하시겠습니까?(y/N)")) {
        		list.remove(board);
        		System.out.println("삭제하였습니다");
        	} else {
        		System.out.println("삭제를 취소하였습니다");
        }
	}
	}
	public void doUpdate() {
    	System.out.println("게시물 변경");
        int no = Prompts.inputInt("번호: ");
        Board board = findByNo(no);
        if(board == null) {
            System.out.printf("%s 는 존재하지 않는 게시물정보입니다", no);
            return;
        } 
               String title = Prompts.inputString("제목(%s)" , board.getTitle());
               if(title.isEmpty()) {
               	title = board.getTitle();
               }
               String content = Prompts.inputString("내용(%s)" , board.getContent());
                
               if(Prompts.confirm2("변경하시겠습니까? y/N)" )){
            	   board.setTitle(title);
            	   board.setContent(content);
            	   board.setRegDate(new Date(System.currentTimeMillis()));
            	   System.out.println("변경되었습니다");
               } else {
            	   System.out.println("변경 취소");
               }
        
	}
	public void doView() {
    	System.out.println("게시물 상세 정보");
        int no = Prompts.inputInt("번호: ");
        
        Board board = findByNo(no);
        
        if(board == null) {
            System.out.printf("%s 는 존재하지 않는 학생정보입니다", no);
            return;
        } 
       	    	System.out.printf("제목 : %s\n", board.getTitle());
       	    	System.out.printf("내용 : %s\n", board.getContent());
       	    	System.out.printf("등록일 : %s\n", board.getRegDate().toString());
       	    	board.setViewCount(board.getViewCount() + 1);
       	    	System.out.printf("조회수 : %d\n", board.getViewCount());
        
	}
	public void doList() {
    	System.out.println("게시물 목록");
        Iterator<Board> iterator = list.iterator();
        while(iterator.hasNext()) {
        	Board board = iterator.next();
                System.out.printf("%d, %s, %s, %d\n",  
                        board.getNo(), 
                        board.getTitle(), 
                        board.getRegDate().toString(),
                        board.getViewCount());
        }
	}
	public void doAdd() {
    	System.out.println("게시물 등록");
    	Board board = new Board();
    	board.setNo(Prompts.inputInt("번호? "));
        if(findByNo(board.getNo()) != null) {
        	System.out.println("이미 등록된 번호입니다");
        	return;
        } 
             board.setTitle(Prompts.inputString("제목 "));
             board.setContent(Prompts.inputString("내용 "));
             board.setRegDate(new Date(System.currentTimeMillis()));
             list.add(board);
        
	}
	private Board findByNo(int no) {
		Iterator<Board> iterator = list.iterator();
        while(iterator.hasNext()){
            Board board = iterator.next();
            if(board.getNo() == no) {
                return board;
            }
        }
        return null;
	}
}