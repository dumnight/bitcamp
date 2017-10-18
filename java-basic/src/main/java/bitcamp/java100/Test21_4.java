//## 키보드로부터 입력받기 - 활용

package bitcamp.java100;

import java.io.Console;

public class Test21_4 {

    public static void main(String[] args) {
        // 입력한 학생 정보를 담을 메모리 설계
        class Student {
            String name;
            int age;
            boolean working;
            float gpa;
        }
        
        // 콘솔 객체를 준비
        Console console = System.console();
        
        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다
        }
        
        //키보드로부터 입력 받은 값을 다음 인스턴스에 채워라
        Student s = new Student();
        
        
        
        s.name = console.readLine("이름:");
        s.age = Integer.parseInt(console.readLine("나이:"));
        s.working = Boolean.parseBoolean(console.readLine("재직여부:"));
        s.gpa = Float.parseFloat(console.readLine("졸업학점:"));
        System.out.println("----------------");
        
        
        System.out.printf("이름: %s\n", s.name);
        System.out.printf("나이: %d\n", s.age);
        System.out.printf("재직여부: %b\n", s.working);
        System.out.printf("졸업학점: %.2f\n", s.gpa);
        
        
    }
}


