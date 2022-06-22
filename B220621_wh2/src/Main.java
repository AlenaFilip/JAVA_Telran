import java.util.ArrayList;
import java.util.List;

/* Дан List<String>. Написать метод, который возвращает строку,
которая есть результат объединения всех строк исходного листа через пробел,
при этом, все слова, короче 4 символов должны идти вначале строки,
остальные слова должны сохранить свой порядок.
Например: {“The”, “homework”, “is”, ”not”, “done”, “yet”} -> “The is not yet homework done”.
 */
public class Main {

    public static void main(String[] args) {
        String s1 = "The";
        String s2 = "homework";
        String s3 = "is";
        String s4 = "not";
        String s5 = "done";
        String s6 = "yet";
        List<String> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        list.add(s6);
        System.out.println(makeStringShortLang(list)+".");
    }

    public static String makeStringShortLang(List<String> list){
        String res = "";
        String res2 = "";
        for (String s:list) {
            if(s.length()<4) res += s +" ";
            else res2 += s + " ";
        }
        res+=res2;
        return res.substring(0,res.length()-1);
    }
}
