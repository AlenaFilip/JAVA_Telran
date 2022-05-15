import java.util.Scanner;

public class R0510_5cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println((m==1)? n : (n == 1)? m : (n == m)? n : 2);
    }
}
