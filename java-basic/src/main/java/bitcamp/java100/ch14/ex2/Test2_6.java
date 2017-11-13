// 자바에서 제공하는 BufferedOutputStream 사용
package bitcamp.java100.ch14.ex2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Test2_6 {
	public static void main(String[] args) throws Exception {
		
		// 데이터 준비
		// 랜덤 메서드를 사용하여 임의의 값을 준비
		int[] data = new int[4000000];
		for(int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random() * 100000); 
		}
		//파일에 출력할 객체 생성
		FileOutputStream out = new FileOutputStream("./test3.dat");
		//중간에서 버퍼 기능을 제공할 객체 생성
		//실제 출력하는 일은 위에서 생성한 FIleOutputStream객체가 한다
		BufferedOutputStream out2 = new BufferedOutputStream(out);
		
		long start = System.currentTimeMillis();
		for(int b : data) {
			out2.write(b);
		}
		out2.flush();  // 출력후 끝날때 항상 호출
		long end = System.currentTimeMillis();
		System.out.printf("걸린시간 = %d\n" , (end - start));
		out.close(); 
	}
}


//BufferedOutPutStream

//이렇게 중간에서 가공하는 클래스를 Date Processing Stream Class라고 부른다
//데코레이터 패턴에서 데코레이터(Decorator) 역할을 수행한다