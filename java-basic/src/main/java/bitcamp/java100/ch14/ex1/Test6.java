package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;
import java.sql.Date;

public class Test6 {
	
	public static void main(String[] args) {

		//익명클래스
		//하나의 객체밖에 못만들기 때문에 
		//사용할 곳에 가까이 두는것이 좋다
		File file = new File(".");
		File[] files = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if(name.startsWith("."))
					return false;
				else
					return true;
			}
		});
	
		for(File f : files) {
			System.out.printf("%s %d %s %s\n",
					f.isDirectory() ? "d" : "-",
					f.length(),
					new Date(f.lastModified()).toString(),
					f.getName());
		}	
	}
	
}
