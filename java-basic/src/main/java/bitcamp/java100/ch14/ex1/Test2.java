package bitcamp.java100.ch14.ex1;

import java.io.File;

public class Test2 {
	public static void main(String[] args) throws Exception {
		File file = new File("file2");
		
		System.out.printf("파일 생성=%b\n",file.createNewFile());
		
		System.out.printf("파일 삭제=%b\n",file.delete());
		
		File file2 = new File("dir1");
		System.out.printf("디렉토리 생성=%b\n",file2.mkdir());
		System.out.printf("디렉토리 생성=%b\n",file2.delete());
		 
		File file3 = new File("aaa/bbb/ccc/test.txt");
		
		//디렉토리까지 전부 생성
		System.out.printf("디렉토리2 생성=%b\n",file3.mkdirs());
		
		
		
	}
}


