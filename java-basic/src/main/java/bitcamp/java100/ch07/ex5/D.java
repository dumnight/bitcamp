package bitcamp.java100.ch07.ex5;

public class D extends C {
    /*
    D() {
        super(); // C에 기본생성자가 없기때문
    }
    */
    D(){
      super("g"); //C에 기본생성자가 없기떄문에 존재하는 생성자를 호출하도록 명시적으로 작성해야 함
    }
}
