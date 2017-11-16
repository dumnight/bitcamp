package bitcamp.java100.ch15.ex6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class HTTPClient {
	public static void main(String[] args) throws Exception {
		
		Socket socket =  new Socket("www.etnews.com", 80);
		
		PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
		
		//request-line 출력
		out.println("GET / HTTP/1.1");
		//헤더 출력
		out.println("Host: www.etnews.com");
		
		out.println();
		out.flush();
		
		BufferedReader in = new BufferedReader(
						new InputStreamReader( // 바이너리 스트림 -> 캐릭터 스트림 변환
						socket.getInputStream()));
		
		String line;
		while(true) {
			line = in.readLine();
			System.out.println(line);
			if(line.equals(""))
				break;
		}
		int b;
		while((b = in.read()) != -1) {
			System.out.print((char)b);
		}
		
		out.close();
		in.close();
		socket.close();
	}
}	
