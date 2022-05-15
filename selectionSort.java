public class selectionSort {
    public static void selection(int array[]) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++) {
            int ind_min = i;

            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[ind_min]) {
                    ind_min = j;
                }
            }
            int tmp = array[i];
            array[i] = array[ind_min];
            array[ind_min] = tmp;
        }
    }


    public static void main(String[] args) {
        int[] data = {-2, 45, 0, 11, -9, -10};
        selection(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");

        }

    }
}
