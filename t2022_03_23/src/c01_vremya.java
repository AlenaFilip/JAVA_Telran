import java.util.Scanner;

public class c01_vremya {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        System.out.println(h2 * 3600 + m2 * 60 + s2 - h1 * 3600 - m1 * 60 - s1);

    }
}
