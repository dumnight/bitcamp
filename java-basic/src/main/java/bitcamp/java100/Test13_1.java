package bitcamp.java100;
/*
    public class Test13_1{
        public static void main(String args[]){
           int kor, eng, math, soc, sci, eth, chi;
           kor = 100;
           eng = 100;
           math = 100;
           soc = 100;
           sci = 100;
           eth = 100;
           chi = 100;

           int[] scores = new int[7];
           scores[0] = 100;
           scores[1] = 100;
           scores[2] = 100;
           scores[3] = 100;
           scores[4] = 100;
           scores[5] = 100;
           scores[6] = 100;


        }
    }                                                                                   */
    public class Test13_1{
        public static void main(String[] args){
            String[] names = {"홍길동", "임꺽정", "유관순"};
            byte[][] scores = {{100,100,100},{90,90,90},{80,80,80}};
            short[] totals = {300,270,240};
            float[] aver = {100f,90f,80.0f};

            for(int i = 0; i < 3; i++){
                System.out.printf("%s,%d,%d,%d,%d,%.1f\n",names[i],scores[i][0]
                ,scores[i][1],scores[i][1],totals[i],aver[i]);
            }
        }
    }
    
 
                          