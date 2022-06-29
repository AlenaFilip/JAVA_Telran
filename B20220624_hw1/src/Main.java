/*Дан лист Вook{String title, Author author}.
Естественно, один автор Author{firstName, lastName} может быть автором нескольких книг.
Необходимо получить список всех авторов.*/

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Book[] arBooks = {
            new Book("Hamlet","William","Shakespeare"),
            new Book("Anna Karenina","Leo","Tolstoy"),
            new Book("Ulysses","James","Joyce"),
            new Book("In Search of Lost Time","Marcel","Proust"),
            new Book("One Hundred Years of Solitude","Gabriel Garcia","Marquez"),
            new Book("Moby Dick","Herman","Melville"),
            new Book("War and Peace","Leo","Tolstoy")
        };
        List<Book> books = Arrays.asList(arBooks);
        Set<Author> authors = new TreeSet<>();
        for (Book b:books) {
            authors.add(b.getAuthor());
        }
        for (Author a: authors) {
            System.out.println(a);
        }
    }
}
