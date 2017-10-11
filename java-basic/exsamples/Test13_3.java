package bitcamp.java100;

    public class Test13_3{
        public static void main(String args[]){
            // 배열 레퍼런스 선언
            int[] arr1;
            // 배열 생성
            arr1 = new int[3];
            // 배열의 크기를 알아내기 
            System.out.println(arr1.length);
            //레퍼런스 변수를 통해 사용하는 내부 변수를 "프로퍼티(property)"
            //라 부른다.

            arr1[0] = 100;
            arr1[1] = 90;
            arr1[2] = 80;
            
            //java.lang.ArrayIndex.OutOfBoundsException 예외 발생
            //arr1[-1] = 100;
            //arr1[3] = 200;

            


        }
    }                                                                                   
    
    
 
                          