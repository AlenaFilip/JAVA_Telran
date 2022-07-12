import java.util.Objects;

public class Author {
    private String fName;
    private String lName;

    public Author(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public boolean equals(Author o) {
        if (this == o) return true;
        return Objects.equals(fName, o.fName) && Objects.equals(lName, o.lName);
    }

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
