/*Требуется отсортировать массив по неубыванию методом "вставок".
 */

import java.util.Scanner;

public class R0512_sortVstabka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortArrayVstavka(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void sortArrayVstavka(int[] arr){
        int size = arr.length;
        System.out.println(size);
        for (int i = 1; i < size ; i++) {
            int key = arr[i];
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] < key) {
                    arr[j+1] = key;
                    break;
                } else {
                    arr[j+1] = arr[j];
                    if (j==0){
                        arr[j] = key;
                    }
                }
            }
        }
    }
}
