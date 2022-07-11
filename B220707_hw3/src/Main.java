import java.util.*;

/*Предположим, что дан список Book, но в отличие от предыдущей задачи Author –
 класс {String fName, String lName} и книга более сложный объект,
у которого есть список авторов, название и ISBN (International Standard Book Number)
т.е. {String title, List<Author> authors, String ISBN}.
Необходимо сформировать map<Author, List<Book>>,  где ключ - автор,
а значение список его книг. Естественно, если у книги несколько авторов,
то книга должна отразиться в списке книг всех авторов данной книги.
 */
public class Main {

    public static void main(String[] args) {
        Author lt = new Author("Лев", "Толстой");
        Author ai = new Author("Алексей", "Иванов");
        Author ii = new Author("Илья", "Ильф");
        Author ep = new Author("Евгений", "Петров");
        Book b1= new Book("Анна Каренина",lt,"RU1455550");
        Book b2= new Book("Война и мир", lt,"FF1444");
        Book b3= new Book("Воскресенье", lt,"FF1447");
        Book b4= new Book("Географ",ai,"AI444564");
        List<Author> ip = Arrays.asList(ii,ep);
        Book b5= new Book("12 стульев",ip,"IIEP474564");
        Book b6= new Book("Золотой теленок",ip,"IIEP474565");
        List<Book> books = List.of(b1,b2,b3,b4,b5,b6);
        Map<Author,List<Book>> mapBooks = createMapBooks(books);
        for (Author au: mapBooks.keySet()) {
            System.out.println(au.toString()+" "+mapBooks.get(au));
        }


    }
    //сформировать map<Author, List<Book>>
    public static Map<Author,List<Book>> createMapBooks(List<Book> books){
        Map<Author,List<Book>> result = new HashMap<>();
        for (Book bk: books) {
            List<Author> la = bk.getAuthors();
            for (Author au: la) {
                if(result.containsKey(au)){
                    List<Book> books1 = result.get(au);
                    books1.add(bk);
                    result.put(au,books1);
                } else {
                    List<Book> books1 = new ArrayList<>();
                    books1.add(bk);
                    result.put(au,books1);
                }
            }
        }
        return result;
    }

}
