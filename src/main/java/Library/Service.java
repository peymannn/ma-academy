package Library;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private ArrayList<Book> bookList = new ArrayList<Book>();

    protected boolean create(Book book){
        if(! bookList.contains(getByBookId(book.getId()))){
            if(bookList.add(book)){
                return true;
            }
        }
        return false;
    }
    protected boolean delete(int bookID){
        if(bookList.contains(getByBookId(bookID))){
            if( bookList.remove(getByBookId(bookID)) ){
                return true;
            }
        }
        return false;
    }
    protected boolean update(Book book){
        if( delete(book.getId()) && create(book)){
            return true;
        }
        return false;
    }
    protected Book getByBookId(int bookId){
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId() == bookId) {
                return bookList.get(i);
            }
        }
        return null;
    }
    protected List<Book> getAllBook(){return bookList; }

}

