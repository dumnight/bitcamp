// 문장(Statement) - 블록
package bitcamp.java100;

    public class Test16_1{
        public static void main(String[] args){
            int a = 100;
            //블록을 만드는 방법
            {
                System.out.println(a);
                
                //int a = 200; 자바는 바깥 블록에 선언된 변수와 같은 이름으로 변수를 만들 수 없다.
                int b = 200;
                System.out.println(b);
                {
                    System.out.println(b);
                    int c = 300;
                    System.out.println(c);
                }
            }
            
            System.out.println(a);
            //System.out.println(b); 변수는 선언 블록을 벗어나면 제거됨으로 컴파일 할 수 없다.
            
            //System.out.println(c); 자바는 변수 사용 전에 선언이 되어 있어야 한다.
            //int c = 300;
            
            
        
        }
    }
