package bitcamp.java100;

    public class Test12_6{
        public static void main(String args[]){
            byte b1 = 50;
            byte b2 = 50;
            byte b3;
            
            b3 = 100; //literal 값만 허용
            
            //b3 = b1 + b2; 

            b3 = 50 + 50; // literal + literal = literal
            
            //b3 = b1 + 50; // literal + 변수 = 변수
            
             short s1;
             //s1 = b1 + b2; 연산 결과는 int이다 

             //결론 
             //자바로 프로그래밍 할 때 작은 정수 값을 다룰 때도 그냥 4바이트
             //int 메모리를 사용하라
             //파일의 바이너리 데이터를 다룰 때만 byte 메모리를 사용한다.
             
            
        }
    }                                                                                                                                                                