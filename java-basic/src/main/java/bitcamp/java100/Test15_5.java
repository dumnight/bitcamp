// 연산자
package bitcamp.java100;

    public class Test15_5{
        public static void main(String[] args){
            int a = 10;
            int b = 10;
            a = a + 1;
            b = b - 1;
            System.out.printf("a=%d, b=%d\n", a, b);

            a = 10;
            b = 10;
            // 변수의 값을 1 증가 시킨 후 그자리에 변수의 값을 놓는다
            ++a; // a = a + 1
            --b; // b = b + 1
            
            System.out.printf("a=%d, b=%d\n", a, b);    
            // 변수의 값을 먼저 놓은뒤 증가
            a = 10;
            b = 10;
             
            a++; 
            b--;
            System.out.printf("a=%d, b=%d\n", a, b);

            a = 10;
            b = 10;
            int r1 = ++a;
            int r2 = --b;
            System.out.printf("a=%d, b=%d, r1=%d, r2=%d\n", a, b, r1, r2);

            a = 10;
            b = 10;
            int r3 = a++;
            int r4 = b--;
            System.out.printf("a=%d, b=%d, r1=%d, r2=%d\n", a, b, r3, r4);

            a = 10;
            a = ++a;
            System.out.println(a);

            b = 10;
            b = b++;
            System.out.println(b);

            a = 5;
            r1 = ++a + ++a * ++a;
            System.out.printf("a=%d, r1=%d\n", a, r1);

            a = 5;
            r1 = a++ + a++ * a++;
            System.out.printf("a=%d, r1=%d\n", a, r1);

        }
    }                                                                                   
    
    
 
                          