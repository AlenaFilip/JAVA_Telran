import java.util.Scanner;

public class e02_ffffor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rez = 1;
        for (int i=1; i<=n; i++) {
            rez *=i;
        }
        System.out.println(rez);
    }
}
