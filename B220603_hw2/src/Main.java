/*Дан лист Integer. Необходимо написать метод, который возвращает лист аналогичный
заданному, но "перевернутый" задом на перед.
(1, 4,2,9) ->(9,2,4,1)
 */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        list.add(9);
        System.out.println(list);
        list = invert(list);
        System.out.println(list);

    }

    public static List<Integer> invert(List<Integer> lst){
        int leng = lst.size();
        List<Integer> result = new ArrayList<>(leng);
        for (int i = 0; i < leng; i++) {
            result.add(lst.get(leng-1-i));
        }
        return result;
    }

}
