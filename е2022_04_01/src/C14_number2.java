import java.util.Scanner;

public class C14_number2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nmax = 0;
        int n2max = 0;
        int inp = -1;
        while (inp != 0){
            inp = sc.nextInt();
            if (inp>nmax){
                n2max=nmax;
                nmax = inp;
            }
            else if (inp>n2max) n2max=inp;
        }
        System.out.println(n2max);
        sc.close();
    }
}
