public class selectionSort {
    public static void selection(int array[]) {
        int size = array.length;
        for (int i = size - 1; i >=0; i--) {
            int ind_max = i;
            for (int j = 0; j <= i-1 ; j++) {
                if (array[j] > array[ind_max]) {
                    ind_max = j;
                }
            }
            int tmp = array[i];
            array[i] = array[ind_max];
            array[ind_max] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] data = {-2, 45, 45, 11, -9, -10};
        selection(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
}
