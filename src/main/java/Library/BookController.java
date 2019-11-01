package Library;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class BookController {
    List<Book> bookList=new List<Book>() {
        public int size() {
            return bookList.size();
        }

        public boolean isEmpty() {
            return false;
        }
        public boolean contains(Object o) {
            return false;
        }
        public Iterator<Book> iterator() {
            return null;
        }

        public Object[] toArray() {
            return new Object[0];
        }

        public <T> T[] toArray(T[] a) {
            return null;
        }

        public boolean add(Book book) {
            return false;
        }

        public boolean remove(Object o) {
            return false;
        }

        public boolean containsAll(Collection<?> c) {
            return false;
        }

        public boolean addAll(Collection<? extends Book> c) {
            return false;
        }

        public boolean addAll(int index, Collection<? extends Book> c) {
            return false;
        }

        public boolean removeAll(Collection<?> c) {
            return false;
        }

        public boolean retainAll(Collection<?> c) {
            return false;
        }

        public void clear() {

        }

        public Book get(int index) {
            return null;
        }

        public Book set(int index, Book element) {
            return null;
        }

        public void add(int index, Book element) {

        }

        public Book remove(int index) {
            return null;
        }

        public int indexOf(Object o) {
            return 0;
        }

        public int lastIndexOf(Object o) {
            return 0;
        }

        public ListIterator<Book> listIterator() {
            return null;
        }

        public ListIterator<Book> listIterator(int index) {
            return null;
        }

        public List<Book> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    Book book=new Book(1,"Peyman Otobiyografi","Peyman",2019,"Avare",15.5);
    private void create(Book book){
        bookList.add(book);
    }
    private void delete(int bookID){
        bookList.remove(getByBookId(bookID));
    }
    private void update(Book book){
        bookList.remove(book);
        bookList.add(book);
    }
    private Book getByBookId(int bookId){
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getID() == bookId) {
               return bookList.get(i);
            }
        }
    return null;
    }
    private List<Book> getAllBook(){
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.toString());
        }
        return null;
    }
}

