import java.util.ArrayList;
import java.util.List;

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
