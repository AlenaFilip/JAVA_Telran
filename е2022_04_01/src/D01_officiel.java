/*
* Class print first even number
* @alena Filipouskaya
*/

import java.util.Scanner;

public class D01_officiel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int number = sc.nextInt();
        int result = 0;
        boolean first_ev = false;
        while (number != 0){
            if (number % 2 == 0 && first_ev == false) {
                first_ev = true;
                result = number;
            }
            number = sc.nextInt();
        }
        System.out.println(result);
        sc.close();
    }
}
