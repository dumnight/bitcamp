//스태틱 멤버  - 스태틱 필드
package bitcamp.java100.ch06.ex3;

public class Test1 {
    public static void main(String[] args) {
        
        System.console().readLine("계속 실행하려면 엔터를 치세요");
       //스태틱 변수 사용
       // 클래스명.변수명 = 값;
        
        System.out.println(MyClass.v1); //이때 MyClass.class 파일이 메모리에 로딩된다
        
        MyClass.v1 += 200;
        
        System.console().readLine("계속 실행하려면 엔터를 치세요");
        
        System.out.println(MyClass.v1);
        
        
        
    }
}

//클래스 로딩

//.class 파일외부 저장장치에서 JVM이 관리하는 
// 메모리 영역(Method Area라 부른다)으로 복사하는 것을 말한다.


