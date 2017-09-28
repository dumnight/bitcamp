package bitcamp.java100;

    public class Test12_9{
        public static void main(String args[]){
            char c1 = 44032;
            char c2 = 0xAC00;
            
            char c3 = 0xC774 , c4 = 0xD574, c5 = 0xC131;
                
            System.out.printf("%c %c %c\n", c3,c4,c5);

            c3 = '가';
            c4 = '나';
            c5 = '다';

            System.out.printf("%c %c %c\n", c3, c4, c5);

            char x = '7';
            int num = x - 48;
            
            
            System.out.println(num);

        }
    }                                                                                                                                                                