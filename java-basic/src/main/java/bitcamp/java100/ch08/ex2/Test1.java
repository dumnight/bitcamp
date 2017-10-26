//다형성 (polymorphism) - 다형적 변수(polymorphic variables)
package bitcamp.java100.ch08.ex2;

public class Test1 {

    public static void main(String[] args) {
        // 하위는 상위의 모든 특징을 가지고 있다
        Vehicle v;
        v = new Vehicle();
        v = new Boat();
        v = new Car();
        v = new Truck();
        v = new Sedan();
        
        Boat b;
        b = new Boat();
        // b = new Vehicle(); // 하위 분류로 상위 분류를 가리킬 수 없다.
        // b = new Car(); // 다른 파생 분류를 가리킬 수 없다.
        
        Car c;
        c = new Car();
        c = new Truck(); // 하위 분류를 가리킬 수 있다
        c = new Sedan();
        //c = new Boat();
        
        Sedan s;
        s = new Sedan();
        //s = new Truck();
        //s = new Car();
        
        
        //이렇게 상속 관계에 따라 한 레퍼런스에 다양한 클래스의
        //객체 주소를 저장할 수 있다고 해서 다형적 변수라고 부른다
        
        //한개의 변수도 같은 종류의 여러 클래스의 객체를 저장할 수 있어서 프로그래밍이 편하다
        
        
        
    }

}
