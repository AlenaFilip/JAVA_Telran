import java.util.Scanner;

public class c03_apple3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rez;
        if (k % n == 0)
            rez = 0;
        else
            rez  = n - (k % n);
        System.out.println(rez);
    }
}
