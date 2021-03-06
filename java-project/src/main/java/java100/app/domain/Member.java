package java100.app.domain;

import java.sql.Date;

public class Member {
    
    protected int no;
    protected String name;
    protected String email;
    protected String password;
    protected Date regDate;
    
    public Member() {}
    
    public Member(int no, String name, String email) {
        this.no = no;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Member [no=" + no + ", name=" + name + ", email=" + email + ", password=" + password + ", createdDate="
                + regDate + "]";
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Date getRegDate() {
        return regDate;
    }

    public void setRegDate(Date regDate) {
        this.regDate = regDate;
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
    
}









