package Task2_sort_massiv;
import java.util.Arrays;

/*  2. Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
который будет находиться на k-й позиции в конечном отсортированном массиве.
Массив 1 - 100 112 256 349 770
Массив 2 - 72 86 113 119 265 445 892
к = 7
Вывод : 256
Окончательный отсортированный массив -
72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
7-й элемент этого массива равен 256.       */
public class Main {

    public static void main(String[] args) {
        int[] arr1 = {100,112,256,349,770};
        int[] arr2 = {72,86,113,119,265,445,892};
        int k =7;
        int m = arr1.length;
        int n = arr2.length;
        int[] result = new int[m+n];
        int i1 = 0;
        int i2 = 0;
        while (i1<m && i2<n) {
            if(arr1[i1]<arr2[i2]){
                result[i1+i2] = arr1[i1];
                i1++;
            } else {
                result[i1+i2] = arr2[i2];
                i2++;
            }
        }
        while(i1<m){
            result[i1+i2] = arr1[i1];
            i1++;
        }
        while(i2<n){
            result[i1+i2] = arr2[i2];
            i2++;
        }
        System.out.println(Arrays.toString(result));
        System.out.println(result[k]);
    }
}

