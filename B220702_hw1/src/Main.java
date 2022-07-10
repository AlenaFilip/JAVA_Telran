import java.util.*;

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
        String st8 = "списка ,";
        List<String> list =List.of(st1,st2,st3,st4,st5,st6,st8, st7);
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for (String s: list) {
            if (s.trim().contains(" ")){
                set.add(s);
            }
        }
        List<String> ls = new ArrayList<>(set);
        for (String s: ls) {
            System.out.println(s);
        }
    }
}
