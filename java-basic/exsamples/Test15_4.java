// 연산자
package bitcamp.java100;

    public class Test15_4{
        public static void main(String[] args){
            float f1 = 3.141592f;
            int i1 = 7654321;
            System.out.printf("f1-%f, i1=%d\n", f1, i1);   
            // 암시적 형변환
            double r1 = f1 + i1;
            System.out.println(r1);
            // 명시적 형변환
            r1 = (double)f1 + (double)i1;
            System.out.println(r1);
            // 두개의 형변환을 섞어 쓰기
            r1 = (double)f1 + i1;
            System.out.println(r1);
            r1 = f1 + (double)i1;
            System.out.println(r1);
            


        }
    }                                                                                   
    
    
 
                          