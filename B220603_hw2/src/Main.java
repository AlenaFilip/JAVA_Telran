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
        list.add(null);
        System.out.println(list);
//        System.out.println(invert(list));
        invertAltList(list);
        System.out.println(list);
    }

    public static void invertAltList(List<Integer> lst){  // тк это void, сразу понимаем, что лист не новый
        int right = lst.size()-1;
        int left = 0;
        while(left<right){
            Integer tmp = lst.get(right);
            lst.set(right, lst.get(left));
            lst.set(left, tmp);
            left++;
            right--;
        }
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
