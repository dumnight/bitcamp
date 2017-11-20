// 성적 관리 시스템을 사용하는 클라이언트 프로그램
package practice;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("서버주소?");
        String serverAddr = keyboard.nextLine();

        try (Socket socket = new Socket(serverAddr, 9999);
                PrintStream out = new PrintStream(new BufferedOutputStream(socket.getOutputStream()));
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));) {

            String command = in.readLine().split(" ")[1];
            String header = null;
            while (true) {
                header = in.readLine();
                if (header.equals(""))
                    break;
            }
            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type:text/plain;charset=UTF-8");
            out.println();

            if (command.equals("/")) {
                hello(command, out);
            } else {
                request(command, out);

                save();

            }
            out.println(command);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
