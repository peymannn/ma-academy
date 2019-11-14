package Library;

import java.util.ArrayList;
import java.util.List;

public class Service {
    private ArrayList<Book> bookList = new ArrayList<Book>();

    public int create(Book book){
        if(!bookList.contains(getByBookId(book.getId()))){
            bookList.add(book);
            return book.getId();
        }
        return 0;
    }
    public boolean delete(int bookID){
        if(bookList.contains(getByBookId(bookID))){
           bookList.remove(getByBookId(bookID));
           return true;
        }
        return false;
    }
    public boolean update(Book book){
        if( delete(book.getId()) && create(book) != 0){
            return true;
        }
        return false;
    }
    public Book getByBookId(int bookId){
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId() == bookId) {
                return bookList.get(i);
            }
        }
        return null;
    }
    public List<Book> getAllBook(){return bookList; }

}

