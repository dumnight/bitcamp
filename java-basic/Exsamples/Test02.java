/* 소스 파일의 인코딩을 지정하기 */
class Test02 {
  public static void main(String[] args) {
    System.out.println("안녕하세요!");
  }
}

/* 컴파일 할 때 인코딩 오류가 발생하는 이유 윈도우에서 컴파일을 하면 인코딩 오류가 발생한다. 
   자바 컴파일러는 소스 파일을 컴파일할 때 운영체제가 기본으로 사용하는 문자형식으로 되어 있다고 간주한다.
   컴파일러에 소스 파일의 문자 형식을 알려줘야함
   >javac -encoding UTF-8 파일명
*/

