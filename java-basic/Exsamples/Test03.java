class Test03 {
  public static void main(String[] args) {
    System.out.println("안녕하세요!");
  }
}

/* .class 파일 분리(Test03)
>javac -d [.class 파일을 저장할 폴더] [소스파일명]
예)
>md bin
>javac -d bin Test03.java

다른 폴더에 있는 .class 실행
>java -classpath [.class 폴더경로] [파일명]
>java -cp 

일회성 환경변수 적용
set CLASSPATH=[.class 폴더경로]
명령 프롬프트를 닫기전까지 유효


*/