import java.util.Scanner;

    public class sort_lastnum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sortInsertLastnum(arr);
            printArr(arr);
        }
        public static void sortInsertLastnum(int [] arr){
            int n = arr.length;
            for (int i = 0; i < n ; i++) {
                for (int j =0 ; j < n-1-i; j++) {
                    if ((arr[j+1] % 10) < (arr[j] % 10)) {
                        int tmp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = tmp;
                    }
                }
            }
        }
        public static void printArr(int [] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }


