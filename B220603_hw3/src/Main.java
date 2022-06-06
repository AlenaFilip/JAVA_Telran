import java.util.ArrayList;
import java.util.List;

/*Дан лист с именами. Необходимо получить лист в котором присутствуют имена
из исходного листа, но только те, что короче 3 символов.
 */
public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Anna") ;
        list.add("Joan") ;
        list.add("Li") ;
        list.add("Garry") ;
        list.add("Peter") ;
        System.out.println("Shorter then 3 letters :" + shorter3(list));
    }

    public static List<String> shorter3(List<String> list){
        List<String> result = new ArrayList<>();
        for (Integer i = 0; i < list.size(); i++) {
            if (list.get(i).length()<3) {
                result.add(list.get(i));
            }
        }
        return result;
    }
}
