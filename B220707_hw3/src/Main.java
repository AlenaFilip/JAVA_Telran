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
        Map<Author,List<Book>> mapBooks = createMapBooks(books);  //сформировать map<Author, List<Book>>
        for (Author au: mapBooks.keySet()) {
            System.out.println(au.toString()+" "+mapBooks.get(au));
        }
/*     Дан map<Author, List<Book>> (например, сформированный в задаче №3). Но в него вкрались ошибки,
в список книг некоторых авторов попали книги, которые они не писали.
Необходимо:
a)      написать метод, который проверит, есть ли в map такие ошибки.*/
        System.out.println((isErrorInBooks(mapBooks))?"Есть ошибка в списке книг":"Нет ошибки в списке книг");
        mapBooks.get(lt).add(b4);  // в лист книг добавила книгу другого автора - внесла ошибку
        System.out.println(mapBooks.get(lt));
        System.out.println((isErrorInBooks(mapBooks))?"Есть ошибка в списке книг":"Нет ошибки в списке книг");
/* b)      написать метод, который исправит ошибки в исходном map.   */
        correctErrorInBooks(mapBooks);
        System.out.println((isErrorInBooks(mapBooks))?"Есть ошибка в списке книг":"Нет ошибки в списке книг");


/*Предположим, дан список поступивших в библиотеку книг.
Если пришло несколько экземпляров одной и той же книг,
в списке присутствует соответствующее количество одинаковых записей.
Необходимо сформировать Map<Book, Integer>, где ключ это книга,
значение, сколько раз она встречается в списке, т.е. сколько пришло экземпляров.
 */
        List<Book> books1 = new ArrayList<>(books);
        books1.add(new Book("12 стульев",ip,"IIEP474564"));
        books1.add(new Book("Воскресенье", lt,"FF1447"));
        books1.add(new Book("12 стульев",ip,"IIEP474564"));
        books1.add(new Book("Воскресенье", lt,"FF1447"));
        books1.add(new Book("12 стульев",ip,"IIEP474564"));
        System.out.println(createCountBooks(books1));

    }
    //сформировать Map<Book, Integer>,  ключ - книга,
    //значение - сколько пришло экземпляров.
    public static Map<Book, Integer> createCountBooks(List<Book> listBooks){
        Map<Book, Integer> mapBooks = new HashMap<>();
        for (Book bk: listBooks) {
            Integer count = mapBooks.get(bk);
            count=(count==null)? 1:count+1;
            mapBooks.put(bk,count);
        }
        return mapBooks;
    }

/*a)      написать метод, который проверит, есть ли в map такие ошибки.*/
    public static boolean isErrorInBooks(Map <Author, List<Book>> mapBooks){
        boolean result = false;
        for (Map.Entry<Author,List<Book>> entry: mapBooks.entrySet()) {
            for (Book bk: entry.getValue()) {
                if (!bk.getAuthors().contains(entry.getKey())){
                    return true;
                }
            }
        }
        return false;
    }
    /* b)      написать метод, который исправит ошибки в исходном map.   */
    public static void correctErrorInBooks(Map <Author, List<Book>> mapBooks){
        List<Book> errorBooks = new ArrayList<>(); // длаю список ошибочных книг, чтоб добавить их к прав авторам
        for (Map.Entry<Author,List<Book>> entry: mapBooks.entrySet()) {
            Author author = entry.getKey();
            List<Book> books = new ArrayList<>(entry.getValue()); // новый лист, чтоб из map можно было удалять
            for (Book bk: books) {
                if (!bk.getAuthors().contains(author)){
                    errorBooks.add(bk);
                    entry.getValue().remove(bk);  // удалить ошибочную книгу из списка текущего автора
                }
            }
        }
        //  добавляю удаленные ошибочные книги правильным авторам
        for (Book bk: errorBooks) {
            List<Author> la = bk.getAuthors();
            for (Author au: la) {
                List<Book> books1 = mapBooks.get(au);
                if(books1==null){   //  нет такого автора
                    books1 = new ArrayList<>();
                    books1.add(bk);
                    mapBooks.put(au,books1);
                } else {  // есть автор - если нет в списке этой книги, добавляю
                    if (!books1.contains(bk)){
                        books1.add(bk);
                    }
                }
            }
        }
    }

    //сформировать map<Author, List<Book>>
    public static Map<Author,List<Book>> createMapBooks(List<Book> books){
        Map<Author,List<Book>> result = new HashMap<>();
        if (books==null) return result;
        for (Book bk: books) {
            List<Author> la = bk.getAuthors();
            for (Author au: la) {
                List<Book> books1 = result.get(au);
                if(books1==null){
                    books1 = new ArrayList<>();
                    books1.add(bk);
                    result.put(au,books1);
                } else {
                    if (!books1.contains(bk)) books1.add(bk);
                }

            }
        }
        return result;
    }
}
