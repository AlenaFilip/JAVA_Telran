/**
 * НОК (a, b) = a*b /(НОД (a, b))
 */

public class R220504_NOK {
    public static int eulidAlgorithm(int n, int m) {
        int r = n % m ;
        while (r != 0) {
            n = m;
            m = r;
            r = n%m;
        }
        return m;
    }
    public static int Nok(int n, int m) {
        return (n*m)/eulidAlgorithm(n, m);
    }

    public static void main(String[] args) {
        int n1 = 9;
        int n2 = 12;
        System.out.print("НОД ("+ n1+" "+ n2+ ") = " + eulidAlgorithm(n1,n2));
        System.out.println("НОК ("+ n1+" "+ n2+ ") = " + Nok(n1,n2));
    }
}
