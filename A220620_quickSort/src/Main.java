import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // quickSort(array, start, end): void -> method for sort
        // partition(array, start, end): int indexPivot -> helper method for rearrange array elements form pivot
        // swap(array, first, second): void -> helper method for swapping two elements

        int[] array = {39, 22, 2, 55, 6, 20, -1, 555, 203, 100000, 4};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }

    private static void quickSort(int[] array, int start, int end) {
//        System.out.println("start "+ start + ", end " + end);
        if (start >= end) { // условие выходы из рекурсии
            return;
        }
        int indexPivot = partition(array, start, end);
        quickSort(array, start, indexPivot - 1);
        quickSort(array, indexPivot + 1, end);
    }

    private static int partition(int[] array, int partitionStart, int partitionEnd) {
        int pivot = array[partitionEnd]; //choose pivot element
        int index = partitionStart;
        for (int i = partitionStart; i < partitionEnd; i++) {
            if(array[i] <= pivot) {
                swap(array, i, index);
                index++;
            }
        }
        swap(array, partitionEnd, index);

        return index;
    }

    private static void swap(int[] array, int source, int destination) {
        int temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;
    }
}
