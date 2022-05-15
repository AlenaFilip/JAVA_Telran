import java.util.Scanner;

public class a01_while {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = 0;
        while (a<=b){
            if (a % 5 == 0 && a>9 && a<100)
                s += a;
            a++;
        }
        System.out.println(s);
    }
}
