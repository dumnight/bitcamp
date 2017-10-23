//## String 클래스 사용법 - 문자열 (literal)로 String 인스턴스 생성
// literal을 사용하여 암시적으로 String인스턴스를 사용하는법

package bitcamp.java100;

public class Test18_2 {

    public static void main(String[] args) {
        //문자열 literal로 String 인스턴스 생성하기
        
        String s1;
        
        s1 = "ABC가각간";
        // 문자열 literal을 String 레퍼런스에 대입하면 자바 컴파일러는 자동으로 new String() 코드로 변환한다.
        // s1은 레퍼런스 이기 떄문에 절대로 값이 직접 저장 될 수 없다
        // 단지 주소가 저장될 뿐이다.
        
        // literal = 코드로 바로 적는 값
        // 예)12, 12L, 314f, 3.14, true, false, '가'
        
        String s2 = "ABC가각간";
        
        if (s1 == s2)
            System.out.println("s1 == s2");
        
        // literal을 이용하여 암시적으로 String인스턴스를 만들 때는 string pool이라는 별도의 영역에 인스턴스가 
        // constants(상수) pool이라는 별도의 영역에 인스턴스가 생성된다.
        // constants pool 에서는 중복된 내용의 인스턴스를 생성하지 않는다.
        
        
        
    }
}


