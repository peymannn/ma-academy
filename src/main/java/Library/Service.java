package Library;

import java.util.List;

public class Service {
    BookController bookController=new BookController();

    public boolean createService(Book book){
        boolean result=bookController.create(book);
        if (result==false){
            System.out.println("Error in Create");
        }
        return result;
    }
    public boolean deleteService(int bookId){
        boolean result=bookController.delete(bookId);
        if (result==false){
            System.out.println("Error in Delete");
        }
        return result;
    }
    public boolean updateService(Book book){
        boolean result=bookController.update(book);
        if (result==false){
            System.out.println("Error in Update");
        }
        return result;
    }
    public Book getByBookIdService(int bookId){
        Book result=bookController.getByBookId(bookId);
        if (result==null){
            System.out.println("Error in getByBookId");
        }
        return result;
    }
    public List<Book> getAllBook(){return bookController.getAllBook();    }
    public  boolean getAllBookList(){
        try {
            for (int i = 0; i < getAllBook().size(); i++) {
                System.out.println( getAllBook().get(i).AllDatatoString());
            }
            return true;
        }catch (Exception ex){

            return false;
        }

    }
    public int createId(){
        int newId = ((int)(Math.random()*100));
        boolean result=bookController.getAllBook().contains(bookController.getByBookId(newId));
        if(result==true){
            newId=createId();
        }
        return newId;
    }





}
