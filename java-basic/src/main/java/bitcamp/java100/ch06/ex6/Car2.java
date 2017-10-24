package bitcamp.java100.ch06.ex6;

public class Car2 {
    
    static int count;
    
    String model;
    int cc;
    long no;
    int type; // 트럭=1, 승용=2, 승합=3
    int use; // 개인=1, 법인=2, 영업=3
    
    Car2(String model, int cc, int type, int use){
        count++;
        this.model = model;
        this.cc = cc;
        this.type = type;
        this.use = use;
        this.no = System.currentTimeMillis(); // currentTimeMillis 현재까지 경과된 시간을 밀리세컨드로 리턴 
        
        
        try { // 객체 생성 하는데 최소 0.05초 걸린다고 가정
            Thread.currentThread().sleep(50);
        } catch (Exception e) {}
    }
}
