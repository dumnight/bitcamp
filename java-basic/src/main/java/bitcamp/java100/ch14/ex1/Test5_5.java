package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;

public class Test5_5 {
	
	public static void main(String[] args) {

		//익명클래스
		//하나의 객체밖에 못만들기 때문에 
		//사용할 곳에 가까이 두는것이 좋다
		File file = new File(".");
		String[] filesnames = file.list(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if(name.startsWith("."))
					return true;
				else
					return false;
			}
		});
	
		for(String name : filesnames) {
			System.out.println(name);
		}
	
	}
	
}
