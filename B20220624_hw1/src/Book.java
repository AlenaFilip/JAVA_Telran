public class Book {
    private String title;
    private Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String fname, String lname) {
        this.title = title;
        Author author = new Author(fname,lname);
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "<<"+title + ">> by " + author.toString();
    }
}
