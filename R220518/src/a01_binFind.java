/* Задача №4. Двоичный поиск
 Реализуйте алгоритм бинарного поиска.
 В первой строке входных данных содержатся натуральные числа N
 и K (0<N,K≤100000).
 Во второй строке задаются N элементов первого массива, отсортированного по возрастанию,
  а в третьей строке – K элементов второго массива.
 Требуется для каждого из K чисел вывести в отдельную строку "YES",
 если это число встречается в первом массиве, и "NO" в противном случае.
*/

import java.util.Scanner;
public class a01_binFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arrn = new int [n];
        int k = sc.nextInt();
        int [] arrk = new int [k];
        for (int i = 0; i < n; i++) {
            arrn[i] = sc.nextInt();
        }
        for (int i = 0; i < k; i++) {
            arrk[i] = sc.nextInt();
        }
        isArrkInArrn(arrn,arrk);
    }
    public static void isArrkInArrn(int [] arrn, int [] arrk){
        int lenN = arrn.length;
        int lenK = arrk.length;
        for (int i = 0; i < lenK; i++) {
            System.out.println((posInArr(arrn, arrk[i]) == -1)? "NO":"YES" );
        }
    }
    public static int posInArr(int[] arr, int num){
        int mMin = 0;
        int mMax = arr.length-1;
        while (mMax>=mMin){
            int mMidl = mMin + (mMax - mMin) / 2;
            if (num > arr[mMidl]){
                mMin = mMidl+1;
            } else if(num < arr[mMidl]) {
                mMax = mMidl-1;
            } else {
                return mMidl;
            }
        }
        return -1;
    }
}
