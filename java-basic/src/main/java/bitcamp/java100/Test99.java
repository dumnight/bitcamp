package bitcamp.java100;

public class Test99{
    public static void main(String[] args) {
        int toNum = 100;
            /*try {
                toNum = ScannerInput.readInt();
            }catch(Exception e) {
                System.out.println("예외");
                return;
            }*/
        //main 
        int summs = 0;
        for(int i=1; i <= toNum; i++) {
            summs+=i;
        }
        System.out.println("1 to " +toNum+" summation = " + summs);
        
        //메서드1
        int sum = summation(1,toNum);
        System.out.println("1 to " +toNum+" summation = " + sum);
        
        //메서드2
        int sum2 = summation(toNum);
        System.out.println("1 to " +toNum+" summation = " + sum2);
    }
    public static int summation(int start, int end) {
        if(start > end) {return -1;}
        int sum = 0;
        for(int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
        public static int summation(int end) {
            return summation(1,end);
            
        }
            
            
           
            
            //  *****
            //  ****
            //  ***
            //  **
            //  *
          /*  
           int i = 1;
           
           while (i <= 5) {
               int count = 6 - i;
               while(count >= 1) {
               System.out.print("*");
               count--;
               }
               System.out.println();
               i++;
               
           }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
                    
           */
             
             
               
            
            
            
            
            
        
    }   