import java.util.Scanner;

public class a02_schahm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int stolb1 = sc.nextInt();
        int strk1 = sc.nextInt();
        int stolb2 = sc.nextInt();
        int strk2 = sc.nextInt();
        if (Math.abs(stolb2 - stolb1) % 2 == Math.abs(strk2 - strk1) % 2)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
}
