//스태틱 변수와 인스턴스 변수의 활용
package bitcamp.java100.ch06.ex6;

public class Test1 {
    
    public static void main(String[] args) throws Exception {
        
        Car2[] cars = new Car2[6];
        
        cars[0] = new Car2("티코", 800, 3, 2);
        cars[1] = new Car2("티코", 800, 2, 1);
        cars[2] = new Car2("티코", 800, 1, 3);
        
        cars[3] = new Car2("소나타", 1900, 1, 1);
        cars[4] = new Car2("소나타", 1900, 2, 2);
        cars[5] = new Car2("소나타", 1900, 3, 3);
        
        System.out.printf("총 생산량 = %d 대\n", Car2.count);
        
        for(int i = 0; i < cars.length; i++) {
            System.out.printf("%d, %s, %d\n", cars[i].no, cars[i].model, cars[i].cc);
            
        }
            
        
        
    }

}
