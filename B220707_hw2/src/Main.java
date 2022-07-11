import java.util.*;

/*   Дан список Book{String author, String title}.
Необходимо сформировать map<String, List<String>> ,
где ключом будет автор, а значением - список книг данного автора.
 */
public class Main {
    public static void main(String[] args) {
        Book b1= new Book("Иванов","Тобол");
        Book b2= new Book("Толстой","Анна Каренина");
        Book b21= new Book("Толстой","Война и мир");
        Book b22= new Book("Толстой","Воскресенье");
        Book b3= new Book("Иванов","Географ");
        Book b4= new Book("Иванов","Ананас");
        Book b5= new Book("Куприн","Яма");
        List<Book> books = Arrays.asList(b1,b2,b3,b4,b5,b21,b22);
        Map<String,List<String>> listMap = new HashMap<>();
        for (Book b: books) {
            String author = b.getAuthor();
            String title = b.getTitle();
            if(listMap.containsKey(author)){
                List<String> books1 = listMap.get(author);
                books1.add(title);
                listMap.put(author,books1);
            } else {
                List<String> newbook = new ArrayList<>();
                newbook.add(title);
                listMap.put(author,newbook);
            }
        }
        for (Map.Entry<String,List<String>> entry : listMap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
