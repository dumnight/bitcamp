//다형성 (polymorphism) - 다형적 변수의 형변환
package bitcamp.java100.ch08.ex2;

public class Test3 {

    public static void main(String[] args) {
        
        Car c = new Sedan();
        c.model = "티코";
        c.capacity = 4;
        c.enginType = 1;
        c.cylinder = 4;
        c.vavle = 16;
        
        //c 는 실제 Sedan객체를 가리키고 있다
        //Sedan 메모리를 사용하려면 Car 타입의 변수로는 불가능하므로 원래 타입으로 바꾼후 사용
        
        Sedan c2 = (Sedan)c;
        
        c2.auto = true;
        c2.sunroof = false;
        
        System.out.printf("%s, %d, %d, %d, %d, %b, %b\n",
                c2.model, c2.capacity, c2.enginType, c2.cylinder, c2.vavle, c2.auto, c2.sunroof);
        
        
        
    }

}
