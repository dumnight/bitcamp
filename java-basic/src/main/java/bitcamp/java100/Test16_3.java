// 문장(Statement) - 조건문 if
package bitcamp.java100;

    public class Test16_3{
        public static void main(String[] args){
            int age = 17;
            
            if (age <= 19)
                System.out.println("미성년자");
            else
                System.out.println("성인");
            
            age = 57;
            
            if (age >= 65)
                System.out.println("무임승차 입니다.");
            
            System.out.println("-------------------------------------");
            
            age = 27;
            if (age <= 19) 
                System.out.println("미성년자 입니다.");
                System.out.println("청소년 할인 대상자 입니다.");
                
           System.out.println("-------------------------------------");
                
            age = 27;
            if (age <= 19) {
                System.out.println("미성년자 입니다.");
                System.out.println("청소년 할인 대상자 입니다.");
            }
            
            System.out.println("-------------------------------------");
                        
            age = 14;
            
            if (age <= 19)
                if (age > 13) 
                System.out.println("청소년");
                else
                System.out.println("어린이");
                
            
            
           
        }
    }
