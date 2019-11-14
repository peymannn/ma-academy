package Library;

import java.util.List;

public class BookController {
   private Service service = new Service();

    public int createBook(Book book){
        int result = service.create(book);
        return result;
    }
    public boolean deleteBook(int bookId){
        boolean result = service.delete(bookId);
        return result;
    }
    public boolean updateBook(Book book){
        boolean result = service.update(book);
        return result;
    }
    public Book getByBookIdBook(int bookId){
        Book result= service.getByBookId(bookId);
        return result;
    }
    public List<Book> getAllBook(){return service.getAllBook(); }

}


