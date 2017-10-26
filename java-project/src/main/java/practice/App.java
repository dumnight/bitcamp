package practice;

public class App{
    
    
    public static void main(String[] args) {
        ScoreDao scoredao = new ScoreDao();
        ScoreView scoreview = new ScoreView();
        
        while(true) {
            Score score = new Score();
            scoreview.input(score);
            scoredao.add(score);
            
         if(!MessageBox.confirm("계속 하시겠습니까?"))
             break;
        }
        for(int i = 0; i < scoredao.size(); i++) {
            scoreview.print(scoredao.get(i));
        }
           
        
    }   
}

