package Library;

public class Main {
    public static void main(String[] args) {
        BookController controller=new BookController();

        Book book = new Book("Peyman Otobiyografi","Peyman",2019,"Avare",15.5);

        controller.createService(book);
        controller.getAllBookList();
        controller.deleteService(book.getId());
        controller.getAllBookList();
    }
}
