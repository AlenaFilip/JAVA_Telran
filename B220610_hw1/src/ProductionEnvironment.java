import java.util.Arrays;
import java.util.Scanner;

public class ProductionEnvironment implements MakeArrayable{
    @Override
    public int[] makeArray() {
        Scanner sc = new Scanner(System.in);
        int n = 4 ;
        System.out.println("Enter "+n+" numbers separated by a space: ");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
