//## String 클래스 사용법

package bitcamp.java100;

public class Test18_1 {

    public static void main(String[] args) {
        //String 클래스를 가지고 문자열 배열을 만들기
        //1) String 메모리의 주소를 저장할 레퍼런스 선언
        String s1;
        
        //2) 문자열을 저장할 메모리 준비
        s1 = new String("ABC가각간");
        
        // 내부적으로 'A','B','C','가','각','간'의 문자 코드 값을 저장하는 배열이 생성된다
        
        String s2 = new String("ABC가각간");
        
        if(s1 != s2) // 인스턴스의 주소가 서로 다름
            System.out.println("s1 != s2");
        
        
        
        
    }
}


