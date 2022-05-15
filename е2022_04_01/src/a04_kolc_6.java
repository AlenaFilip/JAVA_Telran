import java.util.Scanner;

public class a04_kolc_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int kol = 0;
        while (num != 0){
            if (num % 10 <= 6)
                kol ++;
            num = num / 10;
        }
        System.out.println(kol);
    }
}
