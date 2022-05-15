import java.util.Scanner;

public class d01_8_20 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        if (num3 % 10 == 0 || num3 / 10 % 10 ==0 || num3 / 100 ==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
