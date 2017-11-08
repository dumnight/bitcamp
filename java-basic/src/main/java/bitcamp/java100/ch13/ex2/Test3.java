// RuntimeException 계열 예외
package bitcamp.java100.ch13.ex2;

import java.io.FileReader;

public class Test3 {
	public static void main(String[] args) {
		
		
		System.out.printf("%d / %d = %d", 20, 0, 20 /0);
		//eReader in = new FileReader("hhhhhhhhhhhh");컴파일 오류)
		
		//FileReader in = new FileReader("kkk");
		
		try {
			FileReader in2 = new FileReader("kdddddkk");
			System.out.println("파일 읽기 준비 완료");
		}
		catch (Exception e) {
			System.out.println("FileReader 객체 준비 중 오류 발생");
		}
		
 				
	}
}
