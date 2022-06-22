/*  Дан List<String>. Написать метод, который возвращает строку,
которая есть результат объединения всех строк исходного листа через пробел.
Например: {“I”, “do”, “my”, ”homework”} -> “I do my homework”.  */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s1 = "I";
        String s2 = "do";
        String s3 = "my";
        String s4 = "homework";
        List<String> list = new LinkedList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println(makeStringFromList(list));
    }

    public static String makeStringFromList(List<String> list){
        String res = "";
        for (String s : list) {
            res=res + ((res.isEmpty())? "":" ")+s;
        }
        return res;
    }
}
