// 메서드 - call by value(값) 와 call by reference(주소) 
// call by value 와 call by reference의 차이점
package bitcamp.java100.Test17_17;

    public class Test17_14 {
        // call by value
        // 메서드를 호출할 때 값을 넘긴다
        // 호출자의 로컬 변수의 값을 변경할 수 없다
        static void swap(int a, int b) {
            int temp = a;
            a = b;
            b = temp;
            System.out.printf("swap(): a = %d, b = %d\n", a, b);
        }
        // call by reference
        // 메서드를 호출할 때 메모리의 주소를 넘긴다
        // 메서드에서 호출자의 메모리 값을 변경할 수 있다.
        static void swap2(int[] r) {
            int temp = r[0];
            r[0] = r[1]; 
            r[1] = temp;
            System.out.printf("swap2(): r[0] = %d, r[1] = %d\n", r[0], r[1]);
        }
        
        public static void main(String[] args) {
            //호출할 때 값을 넘기는 예)
            //call by value
            int a = 5;
            int b = 7;
            
            swap(a, b);
            System.out.printf("main(): a = %d, b = %d\n", a, b);
            
            // 호출할 떄 메모리 주소를 넘기는 예
            //call by reference
            // sawp2(&a, &b); C 언어 방식
            
            int[] arr = new int[2];
            arr[0] = 5;
            arr[1] = 7;
            
            swap2(arr);
            System.out.printf("swap2(): arr[0] = %d, arr[1] = %d\n", arr[0], arr[1]);
            
            
        }
    }  
