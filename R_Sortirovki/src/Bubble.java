/*
Сортировка пузырьком
*/
import java.util.Arrays;
import java.util.Scanner;
public class Bubble {
    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9 };
        bubblleSort(data);
        System.out.println(Arrays.toString((data)));
    }
    public static void bubblleSort(int array[]){
        int size = array.length;
        for (int i=0; i < size -1; i++ ){ //n-2  итераций обмена
            for (int j =0; j < size -1 -i;  j++) {
                if (array[j] > array[j+1]){
                    int tmp = array[j] ;
                    array[j] = array[j+1];
                    array[j+1] =tmp;
                }
            }
        }
    }
}
