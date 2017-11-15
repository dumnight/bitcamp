//네트워크 프로그래밍 ServerSocket 사용법
package bitcamp.java100.ch15.ex1;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception {
		
		//클라이언트 연결을 받는 객체 준비
		// IP Address : 인터넷에 연결된 컴퓨터를 구분하는 식별 번호
		// Port : 컴퓨터에서 실행중인 통신 프로그램을 구분하는 식별번호

		//포트번호
		//클라이언트 요청을 받는 서브의 경우 포트 번호를 프로그램에서 저장한다
		//물론 다른 프로그램이 사용하는 번호를 지정할 수 없다
		//클라이언트 프로그램의 포트 번호는 OS로부터 자동으로 부여 받는다.
		
		ServerSocket ss = new ServerSocket(9999);
		System.out.println("서버 실행");
		
		//클라이언트의 연결을 기다린다
		//클라이언트가 서버에 연결을 요청하면 클라이언트 정보가 서버의 대기열에 추가된다
		Socket socket = ss.accept();
		System.out.println("클라이언트와 연결됨");
		System.out.printf("서버 IP = %s\n", socket.getLocalAddress().getHostAddress());
		System.out.printf("서버 Port = %d\n", socket.getLocalPort());
		System.out.printf("클라이언트 IP = %s\n", socket.getInetAddress().getHostAddress());
		System.out.printf("클라이언트 Port = %d\n", socket.getPort());
		
		
		
		ss.close();
		System.out.println("서버 종료");
		
	}
}
