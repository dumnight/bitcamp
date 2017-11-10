package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;

public class Test1_0 {
	public static void main(String[] args) throws Exception {
		File file = new File("sample/a.jpg");
		
		FileInputStream in = new FileInputStream(file);
		
		//바이트 단위로 데이터를 읽더라도 변수의 타입은 int여야 한다
		//read()메서드의 리턴 타입이 int이다
		int b;
		int count = 0;
		while((b = in.read()) != -1) {
			count++;
		}
		System.out.println(count);
		
		in.close();
		
		
	}
}
