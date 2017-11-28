package p_java100.app.dao;

import java.util.List;

import java100.app.domain.Board;

public interface BoardDao {
    
    public List<Board> selectList();
    public int insert(Board board);
    public int update(Board board);
    public int delete(int no);
    public Board selectOne(int no);
}
