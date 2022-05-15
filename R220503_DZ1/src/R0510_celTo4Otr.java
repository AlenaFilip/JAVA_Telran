import java.util.Scanner;

/* c  Требуется написать программу, которая вычислит, сколько всего точек с
   целочисленными координатами принадлежат отрезку.
Входные данные
Даны четыре целых числа – координаты концов отрезка (x1, y1) и (x2, y2).
Каждая из координат не превышает по абсолютной величине значения 1000.
 */
public class R0510_celTo4Otr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int raznx = x2-x1;
        int razny = y2-y1;
        int res = 0;
        if (raznx == 0) res = razny;
        else if (razny == 0) res = raznx;
        else
            res = eulidAlgorithm(raznx, razny);
        res = Math.abs(res);
        System.out.println(res+1);

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
