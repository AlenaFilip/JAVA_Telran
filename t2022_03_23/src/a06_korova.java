import java.util.Scanner;

public class a06_korova {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String kv = " korov";
        if (n % 10 == 1 && n != 11 )
            kv = " korova";
        else if (((n % 10) > 1 && (n % 10) < 5)  && !(n > 10 && n < 15))
            kv = " korovy";
        System.out.println(n + kv);
    }
}
