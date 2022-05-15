import java.util.Scanner;

public class d01_7_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double kat1 = sc.nextDouble();
        double kat2 = sc.nextDouble();
        double gipot = sc.nextDouble();
        if (Math.pow(kat1,2)+Math.pow(kat2,2) == Math.pow(gipot,2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
