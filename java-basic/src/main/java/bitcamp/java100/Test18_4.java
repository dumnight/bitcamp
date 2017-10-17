//## String 클래스 사용법 - eqauls () : String 인스턴스의 내용 비교


package bitcamp.java100;

public class Test18_4 {

    public static void main(String[] args) {
        String s1 = "ABC가각간"; 
        String s2= new String("ABC가각간");
        
        // 레퍼런스의 주소 비교
        // 인스턴스가 같은지 비교한다
        if(s1 != s2)
            System.out.println("s1 != s2");
        
        if(s1.equals(s2)) System.out.println("s1과 s2의 내용물이 같다.");
        
        
    }
}


