package bitcamp.java100.ch15.ex4;

import java.net.Socket;
import java.util.Scanner;

public class SenderStub {
	Socket socket;
	Scanner in;
	public SenderStub(Socket socket) throws Exception {
		this.socket = socket;
		
		System.out.printf("송신자(%s)가 연결되었음\n", socket.getInetAddress().getHostAddress());
		
		in = new Scanner(socket.getInputStream());
	}
	//소켓과 연결된 클라이언트로 부터 메시지를 한 줄 읽어서 리턴한다
	//클라이언트가 메시지를 한 줄 보내지 않으면 영원히 여기에 갇힌다
	public String nextMessage() {
		return in.nextLine();
	}
}
