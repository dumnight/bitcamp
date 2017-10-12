// 문장(Statement) - 조건문 switch
package bitcamp.java100;

    public class Test16_4 {
        public static void main(String[] args) {
            
            int i = 0;

            while (i < 5)
                System.out.println(i++);
            
            System.out.println("------------------------------------");
            
            i = 0;
            while (i < 5) {
                System.out.println("=> ");
                System.out.println(i);
                i++;
            }
            System.out.println("------------------------------------");
            
            i = 1;
            while (i <= 5) {
                int count = 1;
                while (count <= i) {
                    System.out.print("*");
                    count++;
                }
                System.out.println();
                i++;
                
            }
            
            
            System.out.println("------------------------------------");
            
            i = 1;
            
                while (i <= 5) {
                    int count = 5 - i;
                    while (count > 0) {
                    System.out.print(" ");
                    count--;
                }
                count = 1;
                while (count <= i) {
                    System.out.print("*");
                    count++;
                
                }
                System.out.println();
                i++;
            }
                
                System.out.println("------------------------------------");
                
             i = 1;
                 
                 while (i <= 5) {
                     int count = (5 - i) / 2;
                     while (count > 0) {
                         System.out.print(" ");
                         count--;
                     }
                     count = 1;
                     while (count <= i) {
                         System.out.print("*");
                         count++;
                     }
                     System.out.println();
                     i+= 2;
                 }
                 System.out.println("------------------------------------");
                 
                 i = 0;
                 label1: {
                 while (i <= 10) {
                     int count = 1;
                     while (count <= i) {
                         System.out.print("*");
                         if (count == 5) {
                             break label1;
                         }
                         count++;
                     }
                     System.out.println();
                     i++;
                     }
                 }
                 System.out.println();
                 System.out.println("------------------------------------");
            
                 i = 0;
                 label1: 
                 while (i <= 10) {
                     int count = 1;
                     while (count <= i) {
                         System.out.print("*");
                         if (count == 5) {
                             break label1;
                         }
                         count++;
                     }
                     System.out.println();
                     i++;
                     }
                 
                 System.out.println();
                 System.out.println("------------------------------------");
            
                 int a = 2;
                 
                 
                 while (a <= 9) {
                     int b = 1;
                     while (b <= 9) {
                         
                        // System.out.printf(a + "*" + b + "=" + a*b );
                         System.out.printf("%d * %d = %d",a ,b, a*b);
                         System.out.println();
                         b++;
                     }
                     System.out.println();
                     a++;
                 }
                 
                 i = 987654321;
                 
                 while (i > 0) {
                     
                         System.out.printf("%d ", i % 10);
                         i /= 10;
                     }
                 System.out.println();
                 System.out.println("------------------------------------");
                 
                 i = 4885323;
                 
                 int[] cnt = new int[10];
                 
                 while (i > 0) {
                     cnt[i % 10]++;
                     i /= 10;
                 }
                     int x = 0;
                     while (x <= cnt.length) {
                         
                         System.out.printf("%d = %d\n", x, cnt[x]);
                         x++;
                     }
                 
                 
                 
                 
                 
                 
                 
           
        }
    
    }  
