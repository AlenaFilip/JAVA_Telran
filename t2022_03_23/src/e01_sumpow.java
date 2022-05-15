import java.util.Scanner;

public class e01_sumpow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rez = 0;
        while (n > 0){
            rez = rez + n * n;
            n--;
        }
        System.out.println(rez);
    }
}
