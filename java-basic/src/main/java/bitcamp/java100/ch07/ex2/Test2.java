//상속(inheritance) - 기존의 Calculator에 더하기와 빼기 기능을 추가한다
package bitcamp.java100.ch07.ex2;

//상속으로 기능 확장하기
public class Test2 {
    public static void main(String[] args) {
        CalculatorA calc = new CalculatorA();
        calc.plus(10);
        calc.plus(20);
        calc.minus(7);
        calc.multiple(2);
        calc.divide(3);
        
        System.out.println(calc.result);
        
    }
}
