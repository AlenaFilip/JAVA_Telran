import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Дан список String. Необходимо получить список уникальных строк из исходного списка,
которые состоят не менее чем из двух слов (слова разделены пробелом)
 */
public class Main {
    public static void main(String[] args) {
        String st1 = "Дан список String ";
        String st2 = "Необходимо получить список уникальных строк из ";
        String st3 = "исходного ";
        String st4 = "списка ,";
        String st5 = " которые состоят не менее ";
        String st6 = " чем";
        String st7 = " из двух слов (слова разделены пробелом)";
        List<String> list =List.of(st1,st2,st3,st4,st5,st6,st7);
        Set<String> set = new HashSet<>();
        for (String s: list) {
            String s1=s.trim();
            if (s1.contains(" ")){
                set.add(s);
            }
        }
        for (String s: set) {
            System.out.println(s);
        }
    }
}
