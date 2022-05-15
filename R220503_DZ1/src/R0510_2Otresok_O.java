/*На клетчатой бумаге Петя нарисовал отрезок из точки с координатами (a,b)
в точку с координатами (c,d). Через сколько клеток проходит этот отрезок
(считается, что отрезок проходит через клетку,если он проходит через ее внутренность,
если же он проходит только через вершину или по границе клетки, считается,
что он не проходит через клетку).
 */
import java.util.Scanner;

public class R0510_2Otresok_O {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int raznx = Math.abs(c-a);
        int razny = Math.abs(d-b);
        int res = 0;
        if (raznx == 0 || razny == 0) res = 0;
        else {
            int nod = eulidAlgorithm(raznx, razny);
            res = raznx + razny - 1 - (nod - 1) ;
        }
        System.out.println(res);
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
