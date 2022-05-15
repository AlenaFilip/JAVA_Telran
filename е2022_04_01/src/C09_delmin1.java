// Найти минимальный делитель числа отличный от 1

import java.util.Scanner;
public class C09_delmin1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i=2; i<=x; i++){
            if (x % i ==0 ) {
                System.out.print(i);
                break;
            }
        }
    }
}