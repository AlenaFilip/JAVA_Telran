/*  23. *Задача обратная предыдущему пункту. Допустим, дано число long реализовать метод,
который вернет массив int состоящий из разрядов этого числа.
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        long numb = 123456455550004700l;
        int[] arr1 = longToArray(numb);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] longToArray(long numb){
        long tmpNumb = 0;  // сюда накапливаем число в обратном порядке (задом наперед)
        int count = 0;  // колво цифр
        while(numb != 0){
            long lastNumb = numb % 10;
            tmpNumb = tmpNumb * 10 + lastNumb;
            numb /=10;
            count++;
        }
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (int) tmpNumb % 10; // по 1 цифре с конца заносим в массив
            tmpNumb /=10;
        }
        return arr;
    }
}
