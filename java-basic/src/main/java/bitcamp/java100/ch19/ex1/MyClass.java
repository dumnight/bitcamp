package bitcamp.java100.ch19.ex1;

@MyAnnotation
//@MyAnnotation 중복불가
public class MyClass {
    @MyAnnotation
    public int a;
    
    @MyAnnotation
    public void m() {
        
        //@MyAnnotation 일반문장에는 붙일 수 없다
        System.out.println("Hello");
    }
    
    public void m2(@MyAnnotation int a, @MyAnnotation String b) {
        
        @MyAnnotation
        int x = 10;
        
    }
    
    
    
}
