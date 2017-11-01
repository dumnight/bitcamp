// 제네릭(Generic) 적용 후
package bitcamp.java100.ch09.ex6;

public class Test2 {
    
    public static void main(String[] args) {

        //제네릭을 도입한 클래스를 사용할때 타입의 이름을 전달해야 한다
        //전달하지 않으면 기본 Object가 되고 경고가 뜸
        Stack2<Contact> contacts = new Stack2<>();
        
        contacts.push(new Contact("홍길동", "hong@test.com", "1111-1111"));
        contacts.push(new Contact("임꺽정", "leem@test.com", "1111-1111"));
        contacts.push(new Contact("유관순", "yoo@test.com", "1111-1111"));
        
        //contacts.push(new String("안중근")); 컴파일 오류
        //contacts.push(new Boolean(true));    컴파일 오류
        
        Contact c1 = (Contact)contacts.pop(); // 타입캐스팅도 필요가 없다
        Contact c2 = contacts.pop();
        
        Stack2<Book> bookStack = new Stack2<>();
        bookStack.push(new Book());
        bookStack.push(new Book());
        
        // bookStack.push(new String()); push()의 파라미터 타입이 Book이기 때문에 다른 타입값을 넣을 수 없다 
        
        Book b1 = bookStack.pop();
        Book b2 = bookStack.pop();
        
        Stack2<Score> scoreStack = new Stack2<>();
        scoreStack.push(new Score());
        scoreStack.push(new Score());
        
        Score s1 = scoreStack.pop();
        Score s2 = scoreStack.pop();
        
        Stack2<Contact> contactStack = new Stack2<>();
        contactStack.push(new Contact());
        contactStack.push(new Contact());
        
        Contact c3 = contactStack.pop();
        Contact c4 = contactStack.pop();
        
        
        
        
    }
}
