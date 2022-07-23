/* Допустим, Ваш метод должен получить массив int размером 10x10 элементов.
Необходимо, что бы ваш метод бросал IllegalArgumentException
если размер переданного массива некорректен или вместо массива пришел null.  */

package Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10,11},   // ошибка
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10},
                {1,2,3,4,5,6,7,8,9,10}};
        try {
            makeWith10_10(arr);
            System.out.println("Данные корректны");
        } catch (IllegalArgumentException e){
            System.out.println("Требуется массив 10*10");
        }
    }

    public static void makeWith10_10(int[][] arr) throws IllegalArgumentException{
        boolean correct = false;
        if (arr.length==10){
            correct = true;
            for (int i = 0; i < 10; i++) {
                if(arr[i].length!=10){
                    correct = false;
                    break;
                }
            }
        }
        if (!correct){
            throw new IllegalArgumentException();
        }
    }
}
