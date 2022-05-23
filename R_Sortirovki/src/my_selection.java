import java.util.Arrays;
import java.util.Scanner;

public class my_selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sortInsertMax(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void sortInsertMax(int [] arr){
        int n = arr.length;
        for (int i = n-1; i >=0 ; i--) {
            int myMax=arr[i];
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] > myMax){
                    int t = arr[j];
                    arr[j] = myMax;
                    myMax = t ;
                }
            }
            arr[i] = myMax;
        }
    }
}
