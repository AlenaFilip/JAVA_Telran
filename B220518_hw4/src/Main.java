/*  4 Implement the method that takes a two-dimensional array
and return the single-dimensional array with all elements of the given array
        ({ {1,2},{3,4},{5,6} }) -> {1,2,3,4,5,6}
 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[][] arr = {{1,2},{3,4},{5,6}};
    System.out.println(Arrays.toString(make1dArray(arr)));

    }
    public static int[] make1dArray(int[][] arr2d){
        int size = 0;
        for (int i = 0; i < arr2d.length; i++) {
            size += arr2d[i].length;
        }
        int arr[] = new int[size];
        int k = 0;
        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[i].length; j++) {
                arr[k] = arr2d[i][j];
                k++;
            }
        }
        return arr;
    }
}
