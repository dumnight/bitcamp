//상속 - 기존의 코드를 복사해서 사용할 때 문제점
package bitcamp.java100.ch07.ex1;

public class Test4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.result = 1;
        calc.multiple(5);
        calc.divide(0);
        calc.multiple(17);
        
        System.out.println(calc.result);
        
    }
}
