/*   232 Требуется отсортировать массив по неубыванию методом "вставок".
В первой строке вводится одно натуральное число, не превосходящее 1000 –
размер массива. Во второй строке задаются N чисел –
элементы массива (целые числа, не превосходящие по модулю 1000).
Вывести получившийся массив.
 */
/*   !!!тут*/
import java.util.Scanner;

public class my_insert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortInsert(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void sortInsert(int [] arr){
        int n = arr.length;
        int myArr= arr[0];
        for (int i = 1; i < n ; i++) {
            myArr = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > myArr) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = myArr;
        }
    }
}
