public class Author implements Comparable<Author>{
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int compareTo(Author o) {
        return lastName.compareTo(o.lastName);
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName ;
    }
}
