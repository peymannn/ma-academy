package Library;

public class Main {
    public static void main(String[] args) {
        BookController controller=new BookController();

        Book book = new Book("Peyman Otobiyografi","Peyman",2019,"Avare",15.5);

        controller.createService(book);
        getAllBookList();
        controller.deleteService(book.getId());
       getAllBookList();
    }
    public  boolean getAllBookList(){
        try {
            for (int i = 0; i < getAllBook().size(); i++) {
                System.out.println( controller.getAllBook().get(i).AllDatatoString());
            }
            return true;
        }catch (Exception ex){
            return false;
        }
    }
}
