package bitcamp.java100.ch06.ex6;

public class Car3 {
    
    //특정 값을 변수로 정의해 두는것을 상수라 한다
    //상수의 완전한 형태
    public final static int TYPE_TRUCK = 1;
    public final static int TYPE_SEDAN = 2;
    public final static int TYPE_BUS = 3;
    
    public final static int USE_PRIVATE = 1;
    public final static int USE_COMPANY = 2;
    public final static int USE_COMMERCIAL = 3;
    
    static int count;
    
    String model;
    int cc;
    long no;
    int type; // 트럭=1, 승용=2, 승합=3
    int use; // 개인=1, 법인=2, 영업=3
    
    Car3(String model, int cc, int type, int use){
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
