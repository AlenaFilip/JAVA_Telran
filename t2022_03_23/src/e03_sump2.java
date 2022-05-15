import java.util.Scanner;

public class e03_sump2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rez = 0;
        for (int i=1; i<=n; i++)
            rez = rez + i * i ;
        System.out.println(rez);
    }
}
