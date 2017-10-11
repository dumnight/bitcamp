package bitcamp.java100;

    public class Test14_1{
        public static void main(String args[]){
            //사용자가 새로 정의한 데이터 타입
            class Score {
                String names;
                int kor;
                int eng;
                int math;
                int sum;
                float aver;

            }
            //메모레의 주소를 저장할 변수 선언
            //클래스명_레퍼런스명;
            Score r1;
            //새로 정의한 데이터 타입에 메모리 준비
            // 레퍼런스 = new_클래스명();
            r1 = new Score();
            // 레퍼런스.내부메모리명 = 값;
            r1.names = "홍길동";
            r1.kor = 100;
            r1.eng = 92;
            r1.math = 96;
            r1.sum = r1.kor + r1.eng + r1.math;
            r1.aver = r1.sum / 3.0f;

            System.out.printf("%s %d %d %d %d %f\n", r1.names, r1.kor, r1.eng,
            r1.math, r1.sum, r1.aver);

        }
    }                                                                                   
    
    
 
                          