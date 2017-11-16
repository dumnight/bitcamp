//프로그램 아규먼트와 vm 아규먼트 
//1)프로그램 아규먼트
// - 자바프로그램을 실행할 때 main()에 넘겨주는 값
//2)VM 아규먼트
// - 자바프로그램을 실행할 때 JVM에 넘겨주는 값
//3)전달방법 - java -cp bin -D변수명=값 ... Test1 값1 값2 값3
// -D 옵션으로 넘겨주는 값을 VM 아규먼트라 부른다
package bitcamp.java100.ch15.ex6;

import java.util.Properties;
import java.util.Set;

public class Test1 {
	public static void main(String[] args) {
		
		//아규먼트 값이 없으면 빈 배열이 넘어온다
		System.out.println("-------------------------------");
		for(String value : args) {
			System.out.println(value);
		}
		//Vm 아규먼트 추출하기
		System.out.println("-------------------------------");
		System.out.println(System.getProperty("aaa"));
		System.out.println(System.getProperty("bbb"));
		
		//Vm에 설정된 모든 프로퍼티 값 출력하기
		System.out.println("-------------------------------");
		Properties props = System.getProperties();
		Set<Object> keySet = props.keySet();
		for(Object key : keySet) {
			System.out.printf("%s=%s\n", key, props.get(key));
		}

		
	}
}
