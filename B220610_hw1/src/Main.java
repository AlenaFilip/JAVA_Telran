/*  Imagine in our program we process an array (for example, an array of integers,or an array of Employee if you want).
In production environment we read this array from User (use Scanner),
in test environment we get it as random array or use an array defined in the code.
So, you need to implement a method getArray() witch as argument takes the way,
how the array will be created and as a result returns the array.
Implement this program (hint: use knowledge about interface)
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the way: 1 - Production, 2 - Test : ");
        int way =sc1.nextInt();
        int[] array = getArray(way);
        System.out.println(Arrays.toString(array));
    }
    public static int[] getArray(int way){
        switch (way){
            case 1: MakeArrayable ma = new ProductionEnvironment(); return ma.makeArray();
            case 2: MakeArrayable te = new TestEnvironment(); return te.makeArray();
            default: return new int[0];
        }
    }
}
