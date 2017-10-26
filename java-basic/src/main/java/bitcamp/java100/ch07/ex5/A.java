package bitcamp.java100.ch07.ex5;

public class A {
    //모든 클래스는 반드시 생성자를 가져야 한다
   /* A(){ // 없으면 자동으로 추가
        super(); //모든 생성자는 첫 번째 문장으로 수퍼 클래스의 기본 생성자를 호출한다
                  //A클래스의 수퍼 클래스는 Object 이기 때문에 Object의 기본 생성자를 호출한다.
      }*/
    
    
    //만약 다음과 같이 생성자를 정의한다면 컴파일러가 기본 생성자를 추가하지 않는다
    A(){
       //수퍼 클래스의 기본 생성자를 호출하는 문장을 생략하게 되면 컴파일러가 자동으로 첫줄에 추가한다
       //super();
       System.out.println("A() 생성자 실행");
       
    }
    //다음과 같이 생성자를 정의할 때 수퍼 생성자 호출을 생략하지 않을 수도 있다.
    A(String str) {
        super(); 
        System.out.println("A(String) 실행");
    }
    
    //수퍼 클래스 생성자를 첫 번쨰로 호출하지 않는다면 컴파일 오류다
    
    A(int i) {
      System.out.println("A(int) 실행");
      // super(); 컴파일 오류
    }
    
}
