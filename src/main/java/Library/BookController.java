package Library;

import java.util.List;

public class BookController {
   private Service service = new Service();

    public int createBook(Book book) {
        return service.create(book);
    }
    public boolean deleteBook(int bookId){
        return service.delete(bookId);
    }
    public boolean updateBook(Book book){
        return service.update(book);
    }
    public Book getByBookIdBook(int bookId) throws Exception {
      try {
          return service.getByBookId(bookId);
      }catch (Exception ex){
          throw  new Exception(ex.getMessage());
      }
    }
    public List<Book> getAllBook(){
        return service.getAllBook();
    }

}


