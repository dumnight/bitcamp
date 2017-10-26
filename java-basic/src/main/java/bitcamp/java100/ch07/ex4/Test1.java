//상속 - Object 클래스
package bitcamp.java100.ch07.ex4;

public class Test1 /*extends Object*/ {
    //모든 클래스는 그 클래스의 정보가 담겨있는 인스턴스 주소를 가지고있다
    //static Class class = new Class();
    //class가 가리키는 인스턴스에는 클래스 정보가 들어 있다
    public static void main(String[] args) {
        
        // 증명1
        // 해당 인스턴스가 어떤 클래스의 자손인지 검사
        // 인스턴트주소 instanceof 클래스이름 
        Test1 obj = new Test1();
        
        if(obj instanceof Test1)
            System.out.println("obj는 Test1의 인스턴스이다");
        
        if(obj instanceof Object)
            System.out.println("obj는 Object의 인스턴스이다");
        
        // 증명2
        // 클래스 정보를 살펴본다
        
        Class c = Test1.class; //Test1 클래스의 정보를 담은 인스턴스 주소를 얻는다
        
        Class sc = c.getSuperclass(); // Test1의 수퍼 클래스 정보를 담은 인스턴스 주소를 얻는다
        
        System.out.println(sc.getName());
        
        
        Class sc2 = sc.getSuperclass(); // Object클래스의 수퍼 클래스
        
        System.out.println(sc2); // null Object의 위는 없다 즉 자바의 최상위(root) 클래스 이다 
        
                
                
   
    }

   
}
