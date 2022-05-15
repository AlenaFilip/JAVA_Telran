import java.util.Scanner;

public class a05_mi_max {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nMin = n % 10;
        int nMax = nMin;
        while(n !=0 ){
            if (n % 10 < nMin)
                nMin = n % 10;
            if (n % 10 > nMax)
                nMax = n % 10;
            n = n / 10;
        }
        System.out.println(nMin+" "+nMax);
    }
}
