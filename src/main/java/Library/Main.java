package Library;

public class Main {
    public static void main(String[] args) {
        Service service=new Service();
        int id=service.createId();
        Book book=new Book(id,"Peyman Otobiyografi","Peyman",2019,"Avare",15.5);

        service.createService(book);
        service.getAllBookList();
        service.deleteService(id);
        service.getAllBookList();
    }
}
