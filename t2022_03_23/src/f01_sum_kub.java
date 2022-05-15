import java.util.Scanner;
public class f01_sum_kub {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rez = 0;
        for (int i=1; i<=n; i++)
            rez = rez + i * i * i;
        System.out.println(rez);
    }
}
