//바이너리 데이터 전송하기 
package bitcamp.java100.ch15.ex5;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws Exception {
		
		//파일 정보 가져오기
		File photo = new File("b.jpg");
		
		//입력 스트림 도구 준비
		FileInputStream fileIn = new FileInputStream(photo);
		
		//서버에 연결
		Socket socket = new Socket("192.168.0.148", 9999);
		
		//서버로 출력하기 위한 스트림 도구 준비
		DataOutputStream netOut = new DataOutputStream(socket.getOutputStream());
		
		// 1) 파일명을 보낸다
		netOut.writeUTF(photo.getName());
		
		// 2) 파일 크기를 보낸다
		netOut.writeLong(photo.length());
		
		// 3) 파일의 전체 데이터를 보낸다
		int b;
		while((b = fileIn.read()) != -1) {
			netOut.write(b);
		}
		
		// 서버로 부터 응답을 받는다
		
		DataInputStream netIn = new DataInputStream(socket.getInputStream());
		String response = netIn.readUTF();
		
		System.out.println(response); // 서버가 보낸 응답을 출력
		
		netOut.close();
		netIn.close();
		socket.close();
		fileIn.close();
	
	}
}
