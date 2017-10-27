//다형성 (polymorphism) - 다형적 변수(polymorphic variables) 2
package bitcamp.java100.ch08.ex2;

public class Test2 {

    public static void main(String[] args) {
        
        Car c;
        
        //하위 클래스의 객체를 가리킬 수 있는 이유
        c = new Car();
        
        //컴파일러는 C 레퍼런스의 사용을 검사할 때
        //그 레퍼런스의 타입 범위 안에서 사용되었는지 검사한다
        c.model = "티코";
        c.capacity = 4;
        c.enginType = 1;
        c.cylinder = 4;
        c.vavle = 16;
        
        //c.auto = true; Car 클래스에 없는 멤버이므로 컴파일 오류
        
        c = new Truck(); // 하위 분류를 가리킬 수 있다
        c.model = "타이탄";
        c.capacity = 3;
        c.enginType = 2;
        c.cylinder = 8;
        c.vavle = 32;
        
        
        c = new Sedan();
        //c = new Boat();
        
        Sedan s;
        s = new Sedan();
        //s = new Truck();
        //s = new Car();
        
        //이렇게 상속 관계에 따라 한 레퍼런스에 다양한 클래스의
        //객체 주소를 저장할 수 있다고 해서 다형적 변수라고 부른다
        
        //한개의 변수도 같은 종류의 여러 클래스의 객체를 저장할 수 있어서 프로그래밍이 편하다
        
        
        // c = new Vehicle(); 컴파일오류 
        
    }

}
