package bitcamp.java100;

    public class Test12_7{
        public static void main(String args[]){
            float f1;
            f1 = 9876567f;
            System.out.println(f1);

            f1 = 9876543456789L;
            System.out.println(f1);

            //f1 = 9876543.4567; 8바이트 부동소수점을 4바이트에 저장할떄 오류

            f1 = 9876543.4567f; // 변수에 값을 넣기 전에 이미 짤린 상태
            System.out.println(f1);

            
        }
    }                                                                                                                                                                