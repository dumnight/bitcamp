package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.sql.Date;

public class Test5_1 {
	
	public static void main(String[] args) {
	
		File file = new File(".");
		String[] filesnames = file.list(new MyFilenameFilter());
	
		for(String name : filesnames) {
			System.out.println(name);
		}
	
	}
	
}
