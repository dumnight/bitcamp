package java100.app.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java100.app.dao.BookDao;
import java100.app.dao.FileDao;
import java100.app.domain.Book;
import java100.app.domain.UploadFile;
import java100.app.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired BookDao bookDao;
    @Autowired FileDao fileDao;
    
    @Override
    public List<Book> list(int pageNo, int pageSize, Map<String, Object> options) {
        
        HashMap<String,Object> params = new HashMap<>();
        params.put("startIndex", (pageNo - 1) * pageSize);
        params.put("size", pageSize);
            
        if (options != null) {
            params.putAll(options);
        }
        
        return bookDao.findAll(params);
    }

    @Override
    public Book get(int no) {
        //따로 따로 가져오기
        Book book =  bookDao.findByNo(no);
        book.setFiles(fileDao.findByBookNo(no));
       
        //book 객체에 묶어서 가져오기
        //Book book = bookDao.findByNo2(no);
        return book;
        
    }
    
    @Override
    public int getTotalCount() {
        return bookDao.countAll();
    }

    @Override
    //@Transactional(propagation=Propagation.NEVER)
    public int add(Book book) {
        //insert를 하기전에는 book의 no 프로퍼티 값은 0이다.
        //insert를 한 후에는 no 프로퍼티에 db에서 생성한 값이 저장된다.
        int count = bookDao.insert(book);
        
        this.addFiles(book.getFiles(), book.getNo());
        
        return count;
    }

    @Override
    public int update(Book book) {
       int count = bookDao.update(book);

       //기존의 게시물 첨부파일을 모두 지운다.
       fileDao.deleteAllByBookNo(book.getNo());
       //다시 게시물 첨부파일을 저장한다.
       addFiles(book.getFiles(), book.getNo());

       return count;
    }

    @Override
    public int delete(int no) {
        //자식 테이블의 데이터를 먼저 지워야만 게시물 데이터를 지울 수 있다.
        //=> 만약 bno 외부키에 대해 on delete cascade가 지정되어 있다면,
        //ex_book 테이블의 데이터를 지우는 즉시 자동으로 자식 테이블인 ex_file의 데이터도
        //지워진다.
        //fileDao.deleteAllByBookNo(no);
        
        return bookDao.delete(no);
    }

    //@Transactional
    @Override
    public void addFiles(List<UploadFile> files, int bookNo) {
        for (UploadFile file : files) {
            
            file.setBookNo(bookNo);
            fileDao.insert(file);
        }
    }
    
}
