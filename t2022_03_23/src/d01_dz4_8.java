import java.util.Scanner;

public class d01_dz4_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        int rez = (num3 % 10) * 100 + (num3 / 10 % 10) * 10 + num3 / 100 - 20;
        System.out.println((rez));
    }
}
