//## 메서드 - 클래스 메서드와 인스턴스 메서드

package bitcamp.java100.Test17_17;

public class Test17_19 {
        
    static class My{
        int value;
        
        
        //인스턴스 메서드
        //특정 클래스의 인스턴스 값을 다루는 전용 메서드
        //static을 붙이지 않는다
        //메서드를 호출할 떄 반드시 인스턴스 주소를 앞에 지정해야 한다
        //그 주소는 메서드의 내장 변수 this에 자동저장.
        
        void print() {
            // My this 메서드를 호출할 때 앞에 저장한 인스턴스 주소
            System.out.println(this.value);
        }
    }
    
    public static void main(String[] args) {
        My r1 = new My();
        My r2 = new My();
        My r3 = new My(); 
        
        r1.value = 100;
        r2.value = 200;
        r3.value = 300;
        
        //인스턴스 메서드는 클래스 이름으로 호출될 수 없다.
        //My.print(r1); // 여류 My.print(r2);
        
        //인스턴스 메서드를 호출할 때 인스턴스 주소르 앞에 저장해야 하다.
        r1.print();
        r2.print();
        r3.print();
        
        // 주의 사항 1
        // 인스터늣 주소 없이 메서드를 호출하면 안된다
        My m4 = null; // 주소가 없는 상황
        // m4.print(); 실행 중 오류
        
        //주의 사항 2
        //인스턴스 메서드가 소속된 클래스와 다른 타입의 인스턴스에 대해 호출하면 안된다
        String s1 = "hello";
        //s1.print(); 컴파일러는 print()앞에 붙은 레퍼런스 클래스에서 print()를 찾는다.
        
        //클래스 메서드를 호출할 떄 클래스 이름 대신 레퍼런스로 호출할 수 있다
        //r1.print(r1);
        //클래스 메서드는 this라는 내장 변수가 없기 떄문에 메서드 앞에 지정한 인스턴스 주소는 버려진다.
        
        //클래스 메서드는 클래스 이름으로 호출하라
        //레퍼런스로 호출할 수 있더라도 클래스 이름으로 호출하여 해당 메서드가 클래스 메서드임을 명확히 하는게
        //소스 코드를 해석하기 쉽게한다
     
        //1)클래스
        //사용자 정의 데이터 타입
        
        //2)인스턴스
        //설게도에 따라 만든 메모리
        
        //3)인스턴스 메서드
        //그 메모리를 다루는 연산자
        //메서드를 정의한다는 것은 해당 타입(클래스)의 연산자를 정의하는 것과 같다
        //그래서 객체지향 분석,설계(OOA/D)에서는 메서드를 operator라고 부른다
        
        //새로운 클래스를 만든다는 것은 새 데이터 타입을 정의한다는 의미다.
        //따라서 새 데이터 타입을 만들었으면 그 데이터 타입의 값을 다루는 새 연산자를 만드는것은 당연
        //그래서 클래스를 정의할 때 보통 인스턴스 메서드를 함꼐 정의한다.
        
        // OOA/D
        // Object-Oriented Analysis and Design
        
        
    }
}

