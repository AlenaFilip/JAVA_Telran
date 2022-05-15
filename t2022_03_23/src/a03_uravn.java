import java.util.Scanner;

public class a03_uravn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == 0 && b == 0)
            System.out.println("INF");
        else if (a == 0)
            System.out.println("NO");
        else if (b == 0)
            System.out.println(0);
        else if (Math.abs(b) >= Math.abs(a) && b % a == 0)
            System.out.println(-b / a);
        else
            System.out.println("NO");
        sc.close();
    }
}
