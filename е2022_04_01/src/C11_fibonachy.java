import java.util.Scanner;

public class C11_fibonachy {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f1=0;
        int f2=1;
        int t =0;
        for (int i=3; i<=n; i++){
            t = f1;
            f1=f2 ;
            f2=f2+t;
        }
        if (n<2) System.out.println(n);
        else System.out.println(f1+f2);
    }
}
