public class myBinarySerch {

    public static void main(String[] args) {
        int[] array = {1, 4, 3, 8, 22, 98};
        int item = 77;
        binarySearch(array, item);
    }

    public static void binarySearch(int[] array, int item) {
        int position;
        int comparisonCount = 1; // to count the number of comparisons
        int first = 0; // start index
        int last = array.length - 1; // end index

        // find the index of the middle element of the array
        position = (first + last) / 2;

        if (array[position] == item) {
            System.out.println("The item was found: position into array is " + position);
            return;
        }

        while ((array[position] != item) && (first <= last)) {
            comparisonCount++;
            System.out.println("position = "+position+" first = "+first+" last="+last);
            if (array[position] > item) {  // the number at the position is less than the given one
                last = position - 1; // true: move to the left
            } else {
                first = position + 1;    // false: move right
            }
            position = (first + last) / 2; // looking for the middle
        }

        if (first <= last) {
            System.out.println("The item was found: position into array is " + position);
        } else {
            System.out.println("The item wasn't found: count comparison");
        }
        System.out.println("count: " + comparisonCount);
    }
}
