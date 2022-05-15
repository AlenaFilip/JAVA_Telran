import java.util.Scanner;

public class С07_delitely {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        for (long i = 1; i<=x; i++){
            if (x % i == 0)
                if (i==1)
                    System.out.print(i);
                else
                    System.out.print(" "+ i);
        }
    }
}
