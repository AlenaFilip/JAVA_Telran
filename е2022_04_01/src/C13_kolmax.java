import java.util.Scanner;

public class C13_kolmax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nmax = 0;
        int  kolv = 0;
        int inp = -1;
        while (inp !=0){
            inp = sc.nextInt();
            if (inp>nmax){
                nmax = inp;
                kolv = 1;
            }
            else if (inp==nmax) kolv++;
        }
        System.out.println(kolv);
    }
}
