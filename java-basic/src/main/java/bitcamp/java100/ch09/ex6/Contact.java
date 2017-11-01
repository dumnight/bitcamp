package bitcamp.java100.ch09.ex6;

class Contact {
    String name;
    String email;
    String tel;
    
    public Contact() {}
    
    public Contact(String name, String email, String tel) {
        this.name = name;
        this.email = email;
        this.tel = tel; //인스턴트에 파라미터값을 저장
    }
}

