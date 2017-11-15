package other;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender {
	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner(System.in);
		
		Socket socket = new Socket("192.168.0.85", 9999);
		
		PrintStream out = new PrintStream(socket.getOutputStream());
		
		while(true) {
			out.println("sender");
			out.println(keyboard.nextLine());
		}
	}
}
