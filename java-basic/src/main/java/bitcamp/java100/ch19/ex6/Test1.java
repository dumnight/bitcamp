package bitcamp.java100.ch19.ex6;

public class Test1 {
    public static void main(String[] args) {
        
        MyAnnotation1 anno = MyClass1.class.getAnnotation(MyAnnotation1.class);
        
        //프로퍼티 값을 지정하지 않으면 기본값이 리턴된다
        String[] names = anno.name();
        int[] ages = anno.age();
                
        for(String n : names)
            System.out.println(n);
        System.out.println("----------------------------");
        for(int a : ages)
        System.out.println(a);
    }
}
