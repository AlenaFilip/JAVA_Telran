import java.util.Scanner;

public class C12_fibonachy2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f1=0;
        int f2=1;
        int fib =1;
        int i=2;
        while (fib<=n){
            fib = f1+f2;
            f1=f2 ;
            f2=fib;
            i++;
        }
        if (fib == n) System.out.println(i);
        else System.out.println(-1);
    }
}