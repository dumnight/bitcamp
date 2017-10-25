public class ScoreDao {
    
    Score[] scores = new Score[10000];
    int cursor = 0;
    
    void add(Score score) {
        if(cursor == scores.length) {
            System.err.println("최대 저장 개수를 초과하였습니다");
            return;
        }
        scores[cursor++] = score;
    }
    
    int size() {
        return cursor;
    }
    Score get(int index) {
        if(index < 0 || index >= cursor) {
            return null;
        }
        return scores[index];
        
        
}
    
    
}
