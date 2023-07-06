import com.sun.jdi.connect.Connector;

public class Book {
    final String nameBook;
    final String author;
    final int est;

    public Book(String nameBook, String author, int est) {
        this.nameBook = nameBook;
        this.author = author;
        this.est = est;
    }

    public void setEst(int est) {

    }
}