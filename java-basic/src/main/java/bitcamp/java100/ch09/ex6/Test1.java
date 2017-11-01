// 제네릭(Generic) 적용
package bitcamp.java100.ch09.ex6;

public class Test1 {
    
    public static void main(String[] args) {

        Stack contacts = new Stack();
        
        contacts.push(new Contact("홍길동", "hong@test.com", "1111-1111"));
        contacts.push(new Contact("임꺽정", "leem@test.com", "1111-1111"));
        contacts.push(new Contact("유관순", "yoo@test.com", "1111-1111"));
        
        //push() 파라미터가 Object이기 때문에 Contact가 아닌 다른 타입의 인스턴스(주소)를 전달해도 문제없다
        //즉 연락처가 아닌 다른 타입 값을 넣어도 컴파일러에서 막을 수 없어 문제다 
        contacts.push(new String("안중근"));
        contacts.push(new Boolean(true));
        
        //값을 꺼낼때도 문제다
        //Contact c = contacts.pop(); 컴파일 오류
        //값을 꺼낼때마다 형변환이 필요
        Contact c = (Contact)contacts.pop();
        
        BookStack bookStack = new BookStack();
        bookStack.push(new Book());
        bookStack.push(new Book());
        
        // bookStack.push(new String()); push()의 파라미터 타입이 Book이기 때문에 다른 타입값을 넣을 수 없다 
        
        Book b1 = bookStack.pop();
        Book b2 = bookStack.pop();
        
        ScoreStack scoreStack = new ScoreStack();
        scoreStack.push(new Score());
        scoreStack.push(new Score());
        
        Score s1 = scoreStack.pop();
        Score s2 = scoreStack.pop();
        
        ContactStack contactStack = new ContactStack();
        contactStack.push(new Contact());
        contactStack.push(new Contact());
        
        Contact c1 = contactStack.pop();
        Contact c2 = contactStack.pop();
        
        
        
        
    }
}
