import java.util.Scanner;

public class d01_4_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        int rez = (num3 / 100 - num3 % 10) * num3/10 %10 ;
        System.out.println(rez);
    }
}
