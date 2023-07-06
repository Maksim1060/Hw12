import com.sun.jdi.connect.Connector;

public class Book {
    final String nameBook;
    final Author author;
    int est;

    public Book(String nameBook, Author author, int est) {
        this.nameBook = nameBook;
        this.author = author;
        this.est = est;
    }public String getNameBook(){
        return this.nameBook;
    }public Author getAuthor(){
        return this.author;
    }public int getEst(){
        return this.est;
    }

    public void setEst(int est) {
        this.est=est;


    }
}