import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 34, -5, 33, 0, 23, 45, 23, -99};
        quickSortArray(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSortArray(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int div = divideArray(arr,start,end);
        quickSortArray(arr,start,div-1);
        quickSortArray(arr,div+1,end);
    }
    public static int divideArray(int[] arr, int start, int end){
        int place = (start+end)/2;
//        int place = end;
        int isPlace = arr[place];
        int divid = start;
        for (int i = start; i <= end ; i++) {
            if (arr[i]<isPlace){
                swapArray(arr, i,divid);
                divid++;
            }
        }
        swapArray(arr,divid,place);
        return divid;
    }

    public static void swapArray(int[] arr, int i1, int i2){
        int tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }
}
