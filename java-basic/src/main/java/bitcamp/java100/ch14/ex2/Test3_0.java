package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3_0 {
	public static void main(String[] args) throws Exception {
		
		
		FileInputStream in = new FileInputStream("sample/b.jpg");
		
		//바이트 단위로 데이터를 읽더라도 변수의 타입은 int여야 한다
		//read()메서드의 리턴 타입이 int이다
		FileOutputStream out = new FileOutputStream(new File("sample/b2.jpg"));
		
		int b;
		while((b = in.read()) != -1) {
			out.write(b);
		}
			
		in.close();
		out.close();
		
		System.out.println("파일 복사 완료");
		
	}
}
