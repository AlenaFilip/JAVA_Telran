import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // quickSort(array, start, end): void -> method for sort
        // partition(array, start, end): int indexPivot -> helper method for rearrange array elements form pivot
        // swap(array, first, second): void -> helper method for swapping two elements

        int[] array = {1,3,6,2,8,0,4,9,5};
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
                if (i!=index) swap(array, i, index);
                index++;
            }
        }
        swap(array, partitionEnd, index);
        return index;
    }

//    i              номер элемента      index
//  перед          0 1 2 3 4 5 6 7 8      после
//  сравнением                          сравнения
//
//     0    1      1 3 6 2 8 0 4 9 5   +    1
//     1    3      1 3 6 2 8 0 4 9 5   +    2
//     2    6      1 3 6 2 8 0 4 9 5        2
//     3    2      1 3 2 6 8 0 4 9 5   +    3    2 <-> 6
//     4    8      1 3 2 6 8 0 4 9 5        3
//     5    0      1 3 2 0 8 6 4 9 5   +    4    0 <-> 6
//     6    4      1 3 2 0 4 6 8 9 5   +    5    4 <-> 8
//     7    9      1 3 2 0 4 6 8 9 5        5
//  конец          1 3 2 0 4 5 8 9 6        5    6 <-> 5

    private static void swap(int[] array, int source, int destination) {
        int temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;
    }
}

