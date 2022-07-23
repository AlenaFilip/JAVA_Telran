package Task1_x_n;
public class Main {
    /* 1. Даны два целых числа x и n, напишите функцию для вычисления x^n
         решение 1 - рекурсивно O(n)
         решение 2 - улучшить решение 1 до O(lon n)  */
    public static void main(String[] args) {
        int x = 2;
        int n = 15;
        System.out.println(x + " ^ " + n + " = " + makePower(x , n ));
        System.out.println("-------");
        System.out.println(x + " ^ " + n + " = " + makePower2(x , n ));
    }

    public static int makePower(int x, int n){
        if (n==1){
            return x;
        } else if (n==0){
            return 1;
        }
        return x*makePower(x,n-1);
    }
    public static int makePower2(int x, int n) {
        System.out.println(n);
        int res=0;
        if (n == 1) {
            return x;
        } else if (n == 0) {
            return 1;
        }
        res = makePower2(x,n/2);
        res=res * res;
        if (n % 2 != 0) res*=x;    // если степень нечетная, умножаем еще раз на x
        return res;
    }
}
