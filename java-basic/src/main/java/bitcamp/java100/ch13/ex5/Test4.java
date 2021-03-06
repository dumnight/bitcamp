package bitcamp.java100.ch13.ex5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
		Scanner keyScan = new Scanner(System.in);
		System.out.print("입력> ");
		String str = keyScan.nextLine().toLowerCase();
		
		try {
			System.out.println("try 블록 실행 ");
			switch (str) {
			case "a": throw new Exception();
			case "b": throw new IOException();
			case "c": throw new FileNotFoundException();
			case "d": throw new SQLException();
			}
			System.out.println(str);
		} catch(Exception e) {
				System.out.println("catch 블록 실행");
		} catch(IOException e) {
			//IOException 은 부모클래스로 Exception이 있기때문에 IOException에 도달하지 못한다
		}
	}
}
