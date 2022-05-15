import java.util.Scanner;

public class R0511_sortMetMax {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selection(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void selection(int[] array) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            int ind_max = 0;
            for (int j = 1; j < size-i; j++) {
                if (array[j] > array[ind_max]) {
                    ind_max = j;
                }
            }
            int tmp = array[size-1-i];
            array[size-1-i] = array[ind_max];
            array[ind_max] = tmp;
        }
    }
}
