package bitcamp.java100.ch14.ex1;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class MyFilenameFilter implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		
		//디렉토리 안에 포함된 파일 중 디렉토리만 리턴배열에 포함시킨다
		File file = new File(dir, name);
		if(file.isDirectory())
			return true;
		else
			return true;
	}
	
}
