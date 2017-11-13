package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileOutputStream;

public class Test2_0 {
	public static void main(String[] args) throws Exception {
		File file = new File("./test.dat");
		
		FileOutputStream out = new FileOutputStream(file);
		
		//바이트 단위로 데이터를 읽더라도 변수의 타입은 int여야 한다
		//read()메서드의 리턴 타입이 int이다
		int[] data = {0x66554420,0x66554421,0x66554422,0x66554423,0x66554424,
				0x66554425,0x66554426,0x66554427,0x66554428,0x66554429};
		
		for(int b : data) {
			System.out.println(Integer.toHexString(b));
			
			//다음 메서드는 파라미터 타입이 int이지만 출력시 4바이트중 맨 끝 1바이트만 
			//출력한다 그래서 항상 바이트 단위로 출력하는 것이다
			out.write(b);
		}
		out.close();
	}
}
