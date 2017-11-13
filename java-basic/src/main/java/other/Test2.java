package other;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Test2 {
	public static void main(String[] args) throws Exception {
		
		Score s = new Score();
		
		DataInputStream in = new DataInputStream(new FileInputStream("test3.dat"));
		
		s.setName(in.readUTF());
		s.setKor(in.readInt());
		s.setEng(in.readInt());
		s.setMath(in.readInt());
		
		in.close();
		
		System.out.println(s);
	}
}
