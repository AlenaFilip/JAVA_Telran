
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

//        Stack stack = new Stack<>();
//        stack.push(1);
//        System.out.println(stack.empty());

//        System.out.println(funIteration(5));
//        System.out.println(funRecursion(5));

        // метод подсчета согласных букв: countConsonantIteration(String str):int
        // метод который проверяет букву: согласна или нет isConsonant(char letter):boolean
//        System.out.println(countConsonantIteration("AbBc 1"));
        String str = "AbBc 1";
        System.out.println(countConsonantRecursion(str, str.length()));
    }

    public static int countConsonantIteration(String str) {
        // AbBc 1
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isConsonant(str.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    private static boolean isConsonant(char letter) {
        // AbBc 1
        letter = Character.toUpperCase(letter);
        if (letter >= 'A' && letter <= 'Z' &&
                !(letter == 'A' || letter == 'E' || letter == 'O' || letter == 'U' || letter == 'I')) {
            return true;
        }
        return false;
    }

    public static int countConsonantRecursion(String str, int n) {
        // AbBc 1
        int count = 0;
        if (n == 1) {
            return isConsonant(str.charAt(0)) ? 1 : 0;
        }
        count = (isConsonant(str.charAt(n-1))? 1: 0)+countConsonantRecursion(str, n - 1) ;
        System.out.println("n= "+ n + " Now count = " + count);
        return count;
    }


    private static int funIteration(int n) {
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res = res + i;
        }
        return res;
    }

    private static int funRecursion(int n) {
        if (n == 1) {
            System.out.println("n = " + n);
            return 1;
        }
        int fun = funRecursion(n - 1);
        int res = n + fun;
        System.out.println("res = " + res + "; n = " + n);
        return res;
    }


}
