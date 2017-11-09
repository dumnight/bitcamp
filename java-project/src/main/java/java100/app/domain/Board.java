package java100.app.domain;

import java.sql.Date;
import java.util.Scanner;

import java100.app.control.CSVFormatException;
import java100.app.util.Prompts;

public class Board {  
    
    protected int no;
    protected String title;
    protected String content;
    protected Date regDate;
    protected int viewCount;
    //: ### 생성자
    //: > 다른 패키지에서도 호출할 수 있도록 public으로 공개한다.
    public Board() {
     
    }
    
    public Board(String csv) throws CSVFormatException {
    	String[] rec = csv.split(",");
        if (rec.length != 5) // 데이터의 개수가 올바르지 않다면,
            throw new CSVFormatException("CSV 데이터 항목의 개수가 올바르지 않습니다");
	  	 this.no = Integer.parseInt(rec[0]);
	   	 this.title = rec[1];
	   	 this.content = rec[2];
	   	 this.regDate = Date.valueOf(rec[3]);
	   	 this.viewCount = Integer.parseInt(rec[4]);
    } 
    
    @Override
    public String toString() {
        return "Board [no=" + no + ", title=" + title + ", content=" + content + ", regDate=" + regDate + ", viewCount="
                + viewCount + "]";
    }
    
    public String toCSVString() {
		return String.format("%d,%s,%s,%s,%d", 
                this.getNo(), 
                this.getTitle(), 
                this.getContent(),
                this.getRegDate().toString(),
                this.getViewCount());
	}
    
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Date getRegDate() {
        return regDate;
    }
    public void setRegDate(Date regDate) {
        this.regDate = regDate;
    }
    public int getViewCount() {
        return viewCount;
    }
    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
    
    
    public void update() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.printf("제목? (%s)", this.title);
        String title = keyScan.nextLine();
        if(title.isEmpty()) {
            title = this.title;
        }
        
        System.out.printf("내용? ", this.content); // 내용이 빌수도있기때문에 if문이 필요없음
        String content = keyScan.nextLine();
        
        if(Prompts.confirm2("변경하시겠습니까? (y/N) ")) {
            this.title = title;
            this.content = content;
            this.regDate = new Date(System.currentTimeMillis());
            System.out.println("변경하였습니다.");
            
        } else {
            System.out.println("변경을 취소하였습니다");
        }
        
        
    }
    
}
