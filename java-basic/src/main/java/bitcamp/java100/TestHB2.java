package bitcamp.java100;

public class TestHB2{
    
   
    public static void main(String[] args) throws Exception{
        TestHB[] cars = new TestHB[6];
        
        cars[0] = new TestHB("티코", 900, 3, 2);
        cars[1] = new TestHB("티코", 900, 2, 1);
        cars[2] = new TestHB("티코", 900, 1, 3);
        
        cars[3] = new TestHB("소나타", 1900, 1, 1);
        cars[4] = new TestHB("소나타", 1900, 2, 2);
        cars[5] = new TestHB("소나타", 1900, 3, 3);
        
        System.out.printf("총 생산량 = %d 대\n", TestHB.count);
        
        for(int i = 0; i < cars.length; i++) {
            System.out.printf("%d, %s, %d\n", 
                    cars[i].no, cars[i].model, cars[i].cc);
        }
        
        
    }
}




