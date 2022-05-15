import java.util.Scanner;

public class C02_rubl922 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int summ = sc.nextInt();
        if (summ % 10 != 0)    // если не делится на 10 без остатка - отказ
            System.out.println("Нет возможности");
        else {
            int kup100 = summ / 100;   // колво купюр по 100
            int kup50 = summ % 100 / 50;   // колво купюр по 50
            int kup10 = summ % 50 / 10;   //  колво купюр по 10
            System.out.println(kup100 + " по 100," + kup50 + " по 50 и "+ kup10 + " по 10 руб");
        }
    }
}
