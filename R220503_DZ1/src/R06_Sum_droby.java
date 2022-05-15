import java.util.Scanner;
public class R06_Sum_droby {
/*Даны две рациональные дроби: a/b и c/d.
Сложите их и результат представьте в виде несократимой дроби m/n.
m/n = (a*d+c*b)/b*d  сократить - разделить обе части на НОД
 */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int m = a * d + c * b;
        int n = b * d;
        int nod = eulidAlgorithm(m,n);
        m = m/nod ;
        n = n/nod ;
        System.out.println(m+" "+n);
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
