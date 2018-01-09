package java100.app.domain;

import java.util.List;

public class Book {
    protected int no;
    protected String title;
    protected String conts;
    protected String publisher;
    protected String pubdt;
    protected int price;
    protected List<UploadFile> files;
    
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
    
    public String getConts() {
        return conts;
    }
    public void setConts(String conts) {
        this.conts = conts;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
 
    public String getPubdt() {
        return pubdt;
    }
    public void setPubdt(String pubdt) {
        this.pubdt = pubdt;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public List<UploadFile> getFiles() {
        return files;
    }
    public void setFiles(List<UploadFile> files) {
        this.files = files;
    }
    
   
    
}










