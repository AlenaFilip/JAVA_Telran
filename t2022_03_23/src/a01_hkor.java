import java.util.Scanner;

public class a01_hkor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int stolb1 = sc.nextInt();
        int strk1 = sc.nextInt();
        int stolb2 = sc.nextInt();
        int strk2 = sc.nextInt();
        if (Math.abs(strk2-strk1) <= 1 && Math.abs(stolb2-stolb1) <= 1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
