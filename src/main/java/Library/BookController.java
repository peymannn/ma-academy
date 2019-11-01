package Library;


import java.util.*;

public class BookController {
    static ArrayList<Book> bookList=new ArrayList<Book>();
    public static void main(String[] args) {
        Book book=new Book(1,"Peyman Otobiyografi","Peyman",2019,"Avare",15.5);
        create(book);
        getAllBookList();
        delete(1);
        getAllBookList();
    }

        public static void create(Book book){
        bookList.add(book);
    }
        public  static void delete(int bookID){
        bookList.remove(getByBookId(bookID));
    }
        public static void update(Book book){
         delete(book.getID());
         create(book);
    }
        public static Book getByBookId(int bookId){
            for (int i = 0; i < bookList.size(); i++) {
                if (bookList.get(i).getID() == bookId) {
                   return bookList.get(i);
                }
            }
           return null;
    }
        public static List<Book> getAllBook(){return bookList;    }
        public static void getAllBookList(){
            for (int i = 0; i < getAllBook().size(); i++) {
                System.out.println( getAllBook().get(i).AllDatetoString());
            }
    }
}


