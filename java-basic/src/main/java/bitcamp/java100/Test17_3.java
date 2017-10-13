// 메서드 - 메서드 정의 문법
package bitcamp.java100;

    public class Test17_3 {
        
        // 2)파라미터가 있는 메서드
        // 파라미터
        // 호출한 쪽에서 보낸 값을 저장하기 위해 선언한 로컬 변수
        // 아래 m2() 메서드에서 name 변수가 바로 파라미터 이다.
        
        static void m1(String name) {
            System.out.printf("%s 님 안녕하세요\n", name);
        }
        //여러개의 값이 넘어올때는 각각의 값을 저장할 변수를 선언하면 된다.
        static void m2(String name, int age) {
            System.out.printf("%s(%d) 님 반갑습니다\n", name, age);
        }
        
        public static void main(String[] args) {
            //메서드를 호출할 때 값을 전달하기
            //메서드를 호출할 떄 파라미터에 넘기는 값을 아규먼트(argu)라 부른다
            m1("홍길동");
            m1("임꺽정");
            m1("유관순");
            
            m2("홍길동", 20);
            m2("임꺽정", 35);
            m2("유관순", 16);
            
            
            
            
        }
    }  
