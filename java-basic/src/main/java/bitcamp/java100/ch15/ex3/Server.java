//대기열 다루기
package bitcamp.java100.ch15.ex3;

import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) throws Exception {
		
		
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("서버 실행");
		
			Socket socket = ss.accept();
			
			//한 줄 단위로 데이터를 읽어주는 객체를 붙인다
			Scanner in = new Scanner(socket.getInputStream());
			
			//연결된 입력 도구를 통해 한 줄 읽는다
			String line = in.nextLine();
			
			//클라이언트에 데이터를 출력하는 객체를 보낸다
			PrintStream out = new PrintStream(socket.getOutputStream());
			
			//읽은 데이터를 그대로 클라이언트로 보낸다
			out.println(line);
			
			in.close();
			out.close();

			socket.close();
			
			ss.close();
			System.out.println("서버 종료");
		
		
	}
}
