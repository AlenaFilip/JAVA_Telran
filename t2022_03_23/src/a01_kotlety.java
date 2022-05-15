import java.util.Scanner;

public class a01_kotlety {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int rez;
        if (k == 0)  // Ни одной котлеты не помещ на сковороде
            rez = 0;
        else {
            rez = n / k;  // колво полных сковородок
            if (n % k > 0)
                rez = rez + 1;
            rez = rez * m * 2;
        }
        System.out.println(rez);
        sc.close();
    }
}
