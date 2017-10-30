//@Overide 애노테이션 
// 잘못된 오버라이딩을 방지하는 특별한 명령
package bitcamp.java100.ch08.ex7;

public class B3 extends B{
    
    //다음과 같이 x 의 m1()을 오버라이딩 한다고 해놓고
    //메서드 이름을 잘못적어 m1() 아닌 ml()로 만들 때 
    void ml(int a, String s) {}
    //컴파일러가 이것을 오버라이딩이 아니라 새 메서드를 
    //추가하는것으로 보기때문에 컴파일 오류가 발생하지 않음
    
    //잦은 오류를 방지하기위한 특별한 주석을 제공
    //오버라이딩하는 메서드 앞에 @Override 주석을 붙임 이런류의 주석을 애노테이션이라 한다
    @Override  
    void mI(int a, String s) {} 
    //매서드 앞에 @Override 애노테이션을 붙이면 컴파일러가 오버라이딩을 제대로 하는지 검사한다
    
   
}
