package bitcamp.java100;

    public class Test99{
        public static void main(String[] args) {
            class Score {
                String names;
                int kor;
                int eng;
                int math;
                int sum;
                float aver;
                
                void compute() {
                    sum = kor + eng + math;
                    aver = sum / 3.0f;
                }
                
                
                
            }
            Score[] scores = new Score[3];
            scores[0] =  new Score();
            scores[1] =  new Score();
            scores[2] =  new Score();
            
            scores[0].names = "가나다";
            scores[0].kor = 101;
            scores[0].eng = 71;
            scores[0].math = 91;
            scores[0].compute();
            
            scores[1].names = "라마바";
            scores[1].kor = 121;
            scores[1].eng = 165;
            scores[1].math = 88;
            scores[0].compute(); 
            
            scores[2].names = "사아자";
            scores[2].kor = 76;
            scores[2].eng = 90;
            scores[2].math = 151;
            scores[0].compute();
            
            
            for(int i =0; i < scores.length; i++) {
                
                System.out.printf("%s %d %d %d %d %f\n", scores[i].names, scores[i].kor, scores[i].eng, 
                        scores[i].math, scores[i].sum, scores[i].aver);
            }
             
        }
}