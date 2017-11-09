package other.domain;

import other.control.CSVFormatException;

public class Member {
    
    protected String name;
    protected String email;
    protected String password;
    
    public Member() {}
    
    public Member(String csv) throws CSVFormatException {
    	String[] rec = csv.split(",");
    	if(rec.length != 3)
    		throw new CSVFormatException("CSV 데이터 항목의 개수가 올바르지 않습니다");
    	
    	try {
    		this.name = rec[0];
    		this.email = rec[1];
    		this.password = rec[2];
    		
    	} catch (Exception e) {
    		throw new CSVFormatException("CSV 데이터 항목의 형식이 올바르지 않습니다");
    	}
    }
    
    public Member(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Member [name=" + name + ", email=" + email + ", password=" + password + "]";
    }

    public String toCSVString() {
   	 return String.format("%d,%d,%d", 
                this.getName(), 
                this.getEmail(), 
                this.getPassword());
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









