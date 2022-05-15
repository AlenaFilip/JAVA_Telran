import java.util.Scanner;

public class e05_geometr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        double rez = 1;
        double ast = 1;
        for (int i =1; i<=n; i++){
            ast = ast*a;
            rez = rez + ast;
        }
        System.out.println(rez);
    }
}
