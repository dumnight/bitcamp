package bitcamp.java100.practice.ee1;

public class Test1 {
    public static void main(String[] args) {
        Object[] arr = new Object[10000];
        
        int cursor = 0;
        
        arr[cursor++] = new String("홍길동");
        arr[cursor++] = new Integer(100);
        arr[cursor++] = 80;
        arr[cursor++] = 180;
        arr[cursor++] = 360 / 3f;
        arr[cursor++] = new String("임꺽정");
        arr[cursor++] = new Integer(10);
        arr[cursor++] = 50;
        arr[cursor++] = 50;
        arr[cursor++] = 110 / 3f;
        
        for(int i = 0; i < cursor; i++) {
            System.out.println(arr[i]);
        }
                
    }
}
