// 메서드 - 인스턴스(클래스 설계도에 따라 만든 메모리)를 다루는 메서드
// 메서드를 이용하여 인스턴스를 다루는 방법
package bitcamp.java100.Test17_17.step6;

    // 인스턴스의 값을 다루는 메서드는 해당 인스턴스의 
    public class Test {
        // 평방미터를 구하는 메서드
        public static void main(String[] args) {

            Rect r; // 인스턴스 주소를 메모리에 저장할 레퍼런스 선언
            r = new Rect(); // 인스턴스를 생성하고 그 주소를 레퍼런스에 저장한다.
            
            r.width = 390; // 단위 cm 3.9
            r.height = 420; // 420 * 100 = 4.2
            

            // 인스턴스 전용 메서드를 호출할 때,
            // - 파라미터가 아닌 메서드 앞에 인스턴스 주소를 지정해야 한다.
            // - 예) 인스턴스주소.메서드명
                
            // 메서드 앞에 준 인스턴스 주소는 해당 메서드의 내장 변수 this에 보관됨.
            System.out.println(r.area());
            System.out.println(r.pyeong());
            
        }
    }  

