package bitcamp.java100;

    public class Test14_6{
        public static void main(String[] args){
            // 사용자 정의 데이터 타입
            class Score {
                String names;
                int kor;
                int eng;
                int math;
                int sum;
                float aver;
                // Score 메모리에 대해 사용할 새 연산자(operator=method)
                void compute(){
                    sum = kor + eng + math;
                    aver = sum / 3.0f;
                }

            }

        Score[] scores = new Score[3];
        scores[0] = new Score();    
        scores[1] = new Score();
        scores[2] = new Score();

        scores[0].names = "홍길동";
        scores[0].kor = 100;
        scores[0].eng = 100;
        scores[0].math = 100;
        scores[0].compute();

        scores[1].names = "임꺽정";
        scores[1].kor = 90;
        scores[1].eng = 90;
        scores[1].math = 900;
        scores[1].compute();
        
        scores[2].names = "유관순";
        scores[2].kor = 100;
        scores[2].eng = 100;
        scores[2].math = 100;
        scores[2].compute();
            
            
            
       for(int i = 0; i < scores.length; i++){

        System.out.printf("%s %d %d %d %d %f\n", scores[i].names, scores[i].kor, scores[i].eng, scores[i].math, scores[i].sum, scores[i].aver);
            
            }
        

        }
    }                                                                                   
    
    
 
                          