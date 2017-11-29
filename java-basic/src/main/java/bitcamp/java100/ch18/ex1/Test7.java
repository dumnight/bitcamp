package bitcamp.java100.ch18.ex1;

import java.lang.reflect.Constructor;

public class Test7 {

    public static void main(String[] args) throws Exception {
        
        Class<?> clazz = X.class;
        
        X obj = (X)clazz.newInstance();
        System.out.println(obj);
        
        Constructor<?> constructor = clazz.getConstructor(int.class);
        
        obj = (X)constructor.newInstance(10);
        System.out.println(obj);
        
        constructor = clazz.getConstructor(int.class, String.class);
        obj = (X)constructor.newInstance(20, "홍길동");
        System.out.println(obj);
        
    }

}
