import java.util.Scanner;

public class a01_ticket {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int stolb1 = sc.nextInt();
        int strk1 = sc.nextInt();
        int stolb2 = sc.nextInt();
        int strk2 = sc.nextInt();
        if (Math.abs(stolb2 - stolb1) != Math.abs(strk2 - strk1))
            System.out.println("NO");
        else
            System.out.println("YES");
        sc.close();
    }
}
