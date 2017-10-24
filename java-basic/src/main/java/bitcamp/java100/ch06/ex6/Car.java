package bitcamp.java100.ch06.ex6;

public class Car {
    
    static int count;
    
    String model;
    int cc;
    long no;
    
    Car(String model, int cc){
        count++;
        this.model = model;
        this.cc = cc;
        this.no = System.currentTimeMillis(); // currentTimeMillis 현재까지 경과된 시간을 밀리세컨드로 리턴 
        
        
        try { // 객체 생성 하는데 최소 0.05초 걸린다고 가정
            Thread.currentThread().sleep(50);
        } catch (Exception e) {}
    }
}
