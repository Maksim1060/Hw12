import com.sun.jdi.connect.Connector;

import java.util.Objects;

public class Book {
    private final String name;
    private Author author;
     private final int est;

    public Book(String name, Author author, int est) {
        this.name = name;
        this.author = author;
        this.est = est;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getEst() {
        return this.est;
    }

    public void setEst(int est) {
        this.est = est;
    }

    public String toString() {
        return getAuthor() + " " + getName() + " " + getEst();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return est == book.est && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, est);
    }
}