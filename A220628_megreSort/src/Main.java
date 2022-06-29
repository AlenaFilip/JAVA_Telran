import java.util.Arrays;

public class Main {

    public static void main(String args[]) {
        /*
        mergeSort(arr) - method that sorts arr[] using marge()
        merge(arr, leftArr, rightArr) - merge two subarrays of arr[]
         */

        int[] arr = {15, 21, 13, 5, 10, 7,1,40,-1000};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        int lengthArr = arr.length; // длинна массивы
        if(lengthArr == 1) { // условие выхода
            return;
        }

        int mid = lengthArr / 2;
        int[] leftArr = new int[mid]; // левый подмассив
        int[] rightArr = new int[lengthArr - mid]; // правый подмассив

        // копируем элементы из массива в подмассивы
        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }

        for (int j = 0; j < lengthArr - mid; j++) {
            rightArr[j] = arr[j + mid];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        // когда мы достигли базового условия
        merge(arr, leftArr, rightArr);
    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr) {
        int indL = 0;
        int indR = 0;
        int lenL = leftArr.length;
        int lenR = rightArr.length;
        while(indL<lenL && indR<lenR){
            if(leftArr[indL]<rightArr[indR]){
                arr[indL+indR] = leftArr[indL];
                indL++;
            } else {
                arr[indL+indR] = rightArr[indR];
                indR++;
            }
        }
        while (indL<lenL) {
            arr[indL+indR] = leftArr[indL];
            indL++;
        }
        while (indR<lenR) {
            arr[indL+indR] = rightArr[indR];
            indR++;
        }
    }
}