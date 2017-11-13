//버퍼 적용
package bitcamp.java100.ch14.ex2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3_3 {
	public static void main(String[] args) throws Exception {
		
		
		FileInputStream in = new FileInputStream("sample/jls9.pdf");
		
		//바이트 단위로 데이터를 읽더라도 변수의 타입은 int여야 한다
		//read()메서드의 리턴 타입이 int이다
		
		BufferedInputStream in2 = new BufferedInputStream(in);
		FileOutputStream out = new FileOutputStream(new File("sample/jls9-4.pdf"));
		
		
		BufferedOutputStream out2 = new BufferedOutputStream(out);
		//버퍼 단위로 파일의 데이터를 읽고 쓴다다
		int b;
		
		long start = System.currentTimeMillis();
		while((b = in2.read()) != -1) {
			// 내부적으로 버퍼에 읽고 버퍼의 내용을 출력한다
			out2.write(b);
		}
		//버퍼에 남은 잔여 데이터를 출력해야 한다
		out2.flush();
		
		
		long end = System.currentTimeMillis();
		System.out.printf("걸린시간 = %d\n" , end - start);
		in.close();
		out.close();
		
		System.out.println("파일 복사 완료");
		
	}
}
