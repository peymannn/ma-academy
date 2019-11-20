package Library;

public class Main {
    public  static BookController controller=new BookController();
    public static void main(String[] args) {
        Book book = new Book("Peyman Otobiyografi","Peyman",2019,"Avare",15.5);

        controller.createBook(book);
        getAllBookList();
        controller.deleteBook(book.getId());
        getAllBookList();
    }

    public static void getAllBookList(){
        try {
            for (int i = 0; i < controller.getAllBook().size(); i++) {
                System.out.println( controller.getAllBook().get(i).AllDatatoString());
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
