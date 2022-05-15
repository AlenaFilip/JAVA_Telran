import java.util.Scanner;

public class C15_maxposl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nmax = 0;
        int inp = -1;
        while (inp !=0){
            inp = sc.nextInt();
            if (inp>nmax){
                nmax = inp;
            }
        }
        System.out.println(nmax);
    }
}
