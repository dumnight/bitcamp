package bitcamp.java100.ch15.ex4;

import java.io.PrintStream;
import java.net.Socket;

public class ReceiverStub {
	Socket socket;
	PrintStream out; //리시버쪽으로 출력할 도구
	
	public ReceiverStub(Socket socket) throws Exception {
		this.socket = socket;
		
		System.out.printf("수신자(%s)가 연결되었음\n", socket.getInetAddress().getHostAddress());
		
		
		
		out = new PrintStream(socket.getOutputStream());
	}

	//클라이언트쪽에 메시지를 보낸다
	public void receive(String message) {
		out.println(message);
	}
}
