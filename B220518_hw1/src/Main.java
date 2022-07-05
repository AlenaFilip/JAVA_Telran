/* Implement the task of counting the same numbers in two arrays
(we did this in the class) using array sorting
 */

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {3, 44, -5, 2, 3, 77, 151, -89, 66};
        int[] arr2 = {22, 66, 71,-8, -5};
        System.out.println(Arrays.toString(sortArray(arr1)));
        System.out.println(Arrays.toString(sortArray(arr2)));
        System.out.println(countSameNum(arr1, arr2));
    }
    // подсчет колва одинаковых элементов в отсортированных массивах
    public static int countSameNum(int[] arri, int[] arrj){
        int result = 0;
        int i =0;
        int j =0;
        while(i < arri.length && j < arrj.length){
            if (arri[i] < arrj[j]){
                i++;
            } else if(arrj[j] < arri[i]){
                j++;
            } else{
                result++;
                i++;
                j++;
            }
        }
        return result;
    }

    // пузырьковая сортировка
    public static int [] sortArray(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 1; j < len-i; j++) {
                if(arr[j-1]>arr[j]){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
        return arr;
    }
}
