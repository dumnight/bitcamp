package other;

import java.net.Socket;
import java.util.Scanner;

public class SenderStub {
	Socket socket;
	Scanner in;
	
	public SenderStub(Socket socket, Scanner in) throws Exception{
		this.socket = socket;
		this.in = in;
		
		System.out.printf("송신자(%s)가 연결되었음\n", socket.getInetAddress().getHostAddress());
		
	}
	
	public String nextMessage() {
		return in.nextLine();
	}
}
