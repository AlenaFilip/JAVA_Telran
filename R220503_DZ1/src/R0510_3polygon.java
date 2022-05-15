import java.util.Scanner;

public class R0510_3polygon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int xLast = x1;
        int yLast = y1;
        int numbPoints = 0;
        for (int i = 2; i <=n+1 ; i++) {
            int x = x1;   // для последнего круга - значение первой точки
            int y = y1;
            if (i <= n) {  // если не последний круг - опрашиваем координаты
                x = sc.nextInt();
                y = sc.nextInt();
            }
            int rx = Math.abs(x - xLast);
            int ry = Math.abs(y - yLast);
            int points = 0;
            if (rx ==0) points = ry;
            else if(ry == 0) points =rx;
            else points=eulidAlgorithm(rx, ry);
            numbPoints+=points;
            xLast = x;
            yLast = y;
        }
        System.out.println(numbPoints);
    }
    public static int eulidAlgorithm(int n, int m) {
        int r = n % m ;
        while (r != 0) {
            n = m;
            m = r;
            r = n%m;
        }
        return Math.abs(m);
    }
}
