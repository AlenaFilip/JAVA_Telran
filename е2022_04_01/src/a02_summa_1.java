import java.util.Scanner;

public class a02_summa_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double rez = 0.00;
        for (double i=1; i<=n; i++)
            rez+= 1 / (i * i);
        System.out.println(rez);
    }
}
