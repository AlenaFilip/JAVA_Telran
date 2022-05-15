import java.util.Scanner;

public class c02_avto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int koldn = m / n;
        if (m % n != 0)
            koldn++;
        System.out.println(koldn);
    }
}
