/* 패키지 이름 짓는 규칙
 - 패키지 이름으로 왜 도메인명을 사용하는가? 왜 도메인명을 거꾸로 사용하는가?
*/

// 소스 파일에서 제일 처음에 패키지를 선언한다.
// 그러면 이후에 선언되는 모든 클래스들은 이 패키지에 소속된다.

// 보통 패키지명이 겹치지 않도록 하기 위해 도메인명을 사용한다
// 폴더 관리를 쉽게 하기 위해 상위 분류명이 상위 도메인명이 상위 폴더가 될 수 있도록
// 도메인명을 거꾸로 사용한다.
package kr.co.bitcamp.java101; 

public class Test09_5 {
  public static void main(String[] ags) {
    System.out.println("Hello!");

  }
}

