package bitcamp.java100.practice.ee1;

public class Test2 {
    public static void main(String[] args) {
        
        Array list = new Array();
        
        list.add(new String("홍길동"));
        list.add(new Integer(100));
        list.add(80);
        list.add(180);
        list.add(360 / 3f);
        list.add(new String("임꺽정"));
        list.add(new Integer(10));
        list.add(50);
        list.add(50);
        list.add(110 / 3f);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d : %s\n", i, list.get(i));
        }
        System.out.println("---------------------------------------------");
        
        list.insert(6, "유관순");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d : %s\n", i, list.get(i));
        }
        System.out.println("---------------------------------------------");
        
        System.out.println(list.remove(19));
        
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d : %s\n", i, list.get(i));
        }
        System.out.println("---------------------------------------------");
        
        list.insert(3, "꺼져좀");
        
        for(int i = 0; i < list.size(); i++) {
            System.out.printf("%d : %s\n", i, list.get(i));
        }
    }
}
