// 연산자
package bitcamp.java100;

    public class Test15_11_2{
        public static void main(String[] args){
            //파일의 정보를 저장하라
            //디렉토리 여부, 소유주/그룹/기타 사용자의 읽기, 쓰기, 실행 권한 정보
            //방법1 : 클래스를 이용하여 처리
            //메모리 설계
            class Privilege {
                boolean isDirectory;
                boolean ownerRead;
                boolean ownerWrite;
                boolean ownerExe;
                boolean groupRead;
                boolean groupWrite;
                boolean groupExe;
                boolean otherRead;
                boolean otherWrite;
                boolean otherExe;
            }
            // Privilege 설계에 따라 메모리를 준비하고 그 메모리에 주소를 저장
            Privilege p1 = new Privilege();
            
            p1.isDirectory = false;
            p1.ownerRead = true;
            p1.ownerWrite = true;
            p1.groupRead = true;
            p1.groupWrite = false;
            p1.groupExe = true;
            p1.otherRead = true;
            p1.otherWrite = false;
            p1.otherExe = true;
            
            System.out.print(p1.isDirectory ? "d" : "-");
            System.out.print(p1.ownerRead ? "r" : "-");
            System.out.print(p1.ownerWrite ? "w" : "-");
            System.out.print(p1.ownerExe ? "x" : "-");
            System.out.print(p1.groupRead ? "r" : "-");
            System.out.print(p1.groupWrite ? "w" : "-");
            System.out.print(p1.groupExe ? "x" : "-");
            System.out.print(p1.otherRead ? "r" : "-");
            System.out.print(p1.otherWrite ? "w" : "-");
            System.out.print(p1.otherExe ? "x" : "-");
            System.out.println();
            
            
            }
            
           
        
        }
    