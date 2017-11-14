// 데이터 프로세싱 스트림 클래스 사용법 - ObjectOutputStream 사용하기
// 
package bitcamp.java100.ch14.ex4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1_0 {
    public static void main(String[] args) throws Exception {
        
        Score s = new Score("홍길동", 800, 900, 1000);
        
        ObjectOutputStream out = new ObjectOutputStream(
                                    new FileOutputStream("test0.dat"));
        
        // ObjectOutputStream은 인스턴스를 바이트 배열로 만들어 출력한다
        // 직렬화(Serialization)라 부른다
        // 조건 - > 직렬화를 허락해야만 수행 가능하다=> 클래스 선언부에 선언한다 (java.io.Serializtion)
        out.writeObject(s); 
        
        out.close();
        
        System.out.println("출력을 완료했습니다.");
        
        
    }
}











