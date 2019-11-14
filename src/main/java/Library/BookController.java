package Library;
import java.util.*;

public class BookController {
   private Service service = new Service();

    public String createService(Book book){
        boolean result = service.create(book);
        if (result == false){
            return "Error in Create";
        } else
            return String.valueOf(result);
    }
    public String deleteService(int bookId){
        boolean result = service.delete(bookId);
        if (result==false){
           return "Error in Delete";
        }
        return String.valueOf(result);
    }
    public String updateService(Book book){
        boolean result = service.update(book);
        if (result == false){
           return "Error in Update";
        }
        return String.valueOf(result);
    }
    public Book getByBookIdService(int bookId){
        Book result= service.getByBookId(bookId);
        if (result==null){
         return null;
        }
        return result;
    }
    public List<Book> getAllBook(){return service.getAllBook(); }
    
}


