// MyBufferedOutputStream 사용
package bitcamp.java100.ch14.ex2;

public class Test2_4 {
	public static void main(String[] args) throws Exception {
		
		// 데이터 준비
		// 랜덤 메서드를 사용하여 임의의 값을 준비
		int[] data = new int[4000000];
		for(int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random() * 100000); 
		}
		
		MyBufferedOutputStream out = new MyBufferedOutputStream("./test2.dat");
		
		long start = System.currentTimeMillis();
		for(int b : data) {
			out.write(b);
		}
		out.flush();  // 출력후 끝날때 항상 호출
		long end = System.currentTimeMillis();
		System.out.printf("걸린시간 = %d\n" , (end - start));
		out.close(); 
	}
}
