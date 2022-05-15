/*  Найдите наибольшую правильную несократимую дробь,
у которой сумма числителя и знаменателя равна n.
 */
import java.util.Scanner;

public class R0510_4fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res1 = (n % 2 == 0)? n/2 -1 : n/2;
        int res2 = n - res1;
        while (res1>1 && nodEuqlid(res1, res2)>1){
            res1 -= 1;
            res2 += 1;
        }
        System.out.println(res1+" "+res2);
    }
    public static int nodEuqlid(int n, int m) {
        int r = n % m ;
        while (r != 0) {
            n = m;
            m = r;
            r = n%m;
        }
        return m;
    }
}
