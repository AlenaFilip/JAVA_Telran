/*
Дана дробь 1. Требуется ее сократить, то есть записать это же число в виде 2, где c — целое число, d — натуральное число и d минимальное возможное.
        Входные данные

        Вводятся два целых числа a и b (–100≤a≤100, 0<b≤100).
        Выходные данные

        Выведите два числа c и d.
 */

import java.util.Scanner;

public class R22050405_sokr_droby {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int nod = eulidAlgorithm(num1,num2);
        nod = Math.abs(nod);
        System.out.println(num1 / nod+" "+num2 / nod);
    }
    public static int eulidAlgorithm(int n, int m) {
        int r = n % m ;
        while (r != 0) {
        n = m;
        m = r;
        r = n%m;
        }
        return m;

    }
}
