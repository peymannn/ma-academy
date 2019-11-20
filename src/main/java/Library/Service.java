package Library;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Service {
    private ArrayList<Book> bookList = new ArrayList<Book>();

    public int create(Book book){
        try {
            if(!bookList.contains(getByBookId(book.getId()))){
                bookList.add(book);
                return book.getId();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new IllegalStateException();
    }

    public boolean delete(int bookID){
        try {
            if(bookList.contains(getByBookId(bookID))){
               bookList.remove(getByBookId(bookID));
               return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean update(Book book){
        if( delete(book.getId()) && create(book) != 0){
            return true;
        }
        return false;
    }
    public Book getByBookId(int bookId) throws Exception {
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId() == bookId) {
                return bookList.get(i);
            }
        }
     return null;
    }
    public List<Book> getAllBook(){return bookList; }

}

