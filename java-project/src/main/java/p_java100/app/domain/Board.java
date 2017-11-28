package p_java100.app.domain;

import java.sql.Date;

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
    
    public Board(int no, String title, String content, int viewCount, Date regDate) {
        this.no = no;
        this.title = title;
        this.content = content;
        this.viewCount = viewCount;
        this.regDate = regDate;
    }
    
    @Override
    public String toString() {
        return "Board [no=" + no + ", title=" + title + ", content=" + content + ", regDate=" + regDate + ", viewCount="
                + viewCount + "]";
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
    
}
