package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;

public class Test5_2 {
	
	static class MyFilenameFilter implements FilenameFilter{

		@Override
		public boolean accept(File dir, String name) {
			
			//디렉토리 안에 포함된 파일 중 디렉토리만 리턴배열에 포함시킨다
			File file = new File(dir, name);
			if(file.isDirectory())
				return false;
			else
				return true;
		}
		
	}
	
	public static void main(String[] args) {
	
		File file = new File(".");
		String[] filesnames = file.list(new MyFilenameFilter());
	
		for(String name : filesnames) {
			System.out.println(name);
		}
	
	}
	
}
