/*
Сортировка пузырьком
*/
import java.util.Arrays;
import java.util.Scanner;
public class Bubble {
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
    public static void main(String[] args) {
        // int[] data = { -2, 45, 0, 11, -9 };
        Scanner con = new Scanner(System.in);
        System.out.print("Введите количество элементов массива N = ");
        int n = con.nextInt();
        int[] data = new int[n];
        System.out.println("\nВведите все элементы массива через пробел: ");
        for (int i = 0; i < n; i++){
            data[i] = con.nextInt();
        }
        bubblleSort(data);
        for (int i = 0; i < data.length;  i++) {
            System.out.print(data[i] + " ");
        }
        //  System.out.println(Arrays.toString((data)));
    }
}
