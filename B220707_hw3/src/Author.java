import java.util.Objects;

public class Author {
    private String fName;
    private String lName;

    public Author(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return Objects.equals(fName, author.fName) && Objects.equals(lName, author.lName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName);
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    @Override
    public String toString() {
        return fName + ' ' + lName ;
    }


}
