package bitcamp.java100;

public class TestHB{
    
    public final static int TYPE_TRUCK = 1;
    public final static int TYPE_SEDAN = 2;
    public final static int TYPE_BUS = 3;
    
    public final static int USE_PRIVATE = 1;
    public final static int USE_COMPANY = 2;
    public final static int USE_COMMERCIAL = 3; 
    
    static int count;
    
    long no;
    String model;
    int cc;
    int type;
    int use;
    
    TestHB(String model, int cc, int type, int use){
        count++;
        
        model = model;
        cc = cc;
        type = type;
        use = use;
        
        no = System.currentTimeMillis();
        
        try {
            Thread.currentThread().sleep(50);
        }   catch(Exception e) {}
        
        
    }
}




