/*Напишите программу, которая сортирует массив по возрастанию "методом камня":
аналогично "методу пузырька", но в обратном порядке: самый "тяжелый" элемент
 из оставшихся спускается к концу массива.
Первая строка содержит размер массива N .
Во второй строке через пробел задаются N чисел – элементы массива.

Программа должна выводить весь массив после каждой перестановки элементов.
Все элементы массива выводятся в одну строку и разделяются пробелами, после окончания
вывода массива выполняется переход на новую строку.
Если перестановок не было, программа выводит только число 0.  */
import java.util.Scanner;

public class my_stone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortInsert(arr);
    }
    public static void sortInsert(int [] arr){
        int n = arr.length;
        boolean isTotalSort = true;
        for (int i = 0; i < n ; i++) {
            int myMin = arr[i];
            for (int j =0 ; j < n-1-i; j++) {
                if (arr[j+1]<arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    isTotalSort = false;
                    printArr(arr);
                }
            }
        }
        if (isTotalSort) {
            System.out.println(0);
        }
    }
    public static void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

