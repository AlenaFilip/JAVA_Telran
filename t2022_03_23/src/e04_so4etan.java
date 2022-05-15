import java.util.Scanner;

public class e04_so4etan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int nf = 1;
        int kf = 1;
        int nkf = 1;
        int i = 1;
        while (i <= n || i <= k ){
            if (i<=n)
                nf = nf*i;
            if (i<=k)
                kf = kf*i;
            if (i<=n-k)
                nkf = nkf*i;
            i++;
        }
        System.out.println(nf / (kf * nkf));
    }
}
