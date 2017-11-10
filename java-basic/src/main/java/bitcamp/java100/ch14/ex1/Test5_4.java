package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;

public class Test5_4 {
	
	public static void main(String[] args) {

		//익명클래스
		FilenameFilter filter = new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if(name.startsWith("."))
					return true;
				else
					return false;
			}
		};
		
		File file = new File(".");
		String[] filesnames = file.list(filter);
	
		for(String name : filesnames) {
			System.out.println(name);
		}
	
	}
	
}
