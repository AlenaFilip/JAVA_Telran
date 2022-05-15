public class InsertionSort {
    public static void Insertion(int array[]) {
        int size = array.length;
        for (int i = 1; i < size; i++ ){
            int key = array[i];
            int j = i - 1;
            while ((j >= 0) && (key < array[j]) ){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] =key;
        }
    }
    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9, -10 };
        Insertion(data);
        for (int i = 0; i < data.length;  i++) {
            System.out.print(data[i] + " ");
        }
    }
}