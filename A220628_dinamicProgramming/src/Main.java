/*  Результат выполнения на 50:
обычная рекусия 69815
Memoriyation 0
Tabulation 0
 */
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int num = 50;
        int[] arr = new int[num + 1];
        for (int i = 2; i <= num; i++) {
            arr[i] = -1;
        }
//        System.out.println(Arrays.toString(arr));

        long time1 = System.currentTimeMillis();
        System.out.println(fibonacciRecursion(num));
        long time2 = System.currentTimeMillis();
        System.out.println("  - time = "+(time2-time1));

        time1 = System.currentTimeMillis();
        System.out.println(fibonacciDpMemoization(num, arr));
        time2 = System.currentTimeMillis();
        System.out.println("  - time = "+(time2-time1));

        time1 = System.currentTimeMillis();
        System.out.println(fibonacciDpTabulation(num));
        time2 = System.currentTimeMillis();
        System.out.println("  - time = "+(time2-time1));

    }

    private static int fibonacciRecursion(int num) {
        if (num == 1) return 1;
        else if (num == 0) return 0;

        return fibonacciRecursion(num - 1) + fibonacciRecursion(num - 2);
    }

    private static int fibonacciDpMemoization(int num, int[] arr) {
        if (num <= 2) {
            return 1;
        }
        if(arr[num] != -1) {
            return arr[num];
        }

        arr[num] = fibonacciDpMemoization(num - 1, arr) + fibonacciDpMemoization(num - 2, arr);
        return arr[num];
    }

    private static int fibonacciDpTabulation(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 0;
        arr[1] = 1;

        int res = 0;

        for (int index = 2; index <= num; index++) {
            arr[index] = arr[index - 2] + arr[index - 1];

            if (index == num) {
                res = arr[index];
            }
        }
        return res;
    }
}