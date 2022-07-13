import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private List <Author> authors;
    private String iSBN;

    public Book(String title, List<Author> authors, String iSBN) {
        this.title = title;
        this.authors = authors;
        this.iSBN = iSBN;
    }

    public Book(String title, Author author, String iSBN) {
        this.title = title;
        this.authors = new ArrayList<>(1);
        authors.add(author);
        this.iSBN = iSBN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(iSBN, book.iSBN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iSBN);
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public String toString() {
        return title;
//        return title + ", authors=" + authors ;
    }
}
