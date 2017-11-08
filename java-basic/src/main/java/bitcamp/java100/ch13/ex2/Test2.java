// RuntimeException 계열 예외
package bitcamp.java100.ch13.ex2;

import java.io.FileReader;

public class Test2 {
	public static void main(String[] args) {
		
		System.out.printf("%d / %d = %d", 20, 0, 20 /0);
		
		try {
			FileReader in = new FileReader("kkk");
			System.out.println("파일 읽기 준비 완료");
		}
		catch (Exception e) {
			System.out.println("FileReader 객체 준비 중 오류 발생");
		}
		
		
		
	}
}
