//버퍼 적용
package bitcamp.java100.ch14.ex2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3_4 {
	public static void main(String[] args) throws Exception {
		
		
		BufferedInputStream in = new BufferedInputStream(
				new FileInputStream(new File("sample/jls9.pdf")));
		
		FileOutputStream out = new FileOutputStream(new File("sample/jls9-4.pdf"));
		BufferedOutputStream out2 = new BufferedOutputStream(out);
		//버퍼 단위로 파일의 데이터를 읽고 쓴다다
		int b;
		
		long start = System.currentTimeMillis();
		while((b = in.read()) != -1) {
			// 내부적으로 버퍼에 읽고 버퍼의 내용을 출력한다
			out.write(b);
		}
		//버퍼에 남은 잔여 데이터를 출력해야 한다
		out .flush();
		
		
		long end = System.currentTimeMillis();
		System.out.printf("걸린시간 = %d\n" , end - start);
		in.close();
		out.close();
		
		System.out.println("파일 복사 완료");
		
	}
}
