/*Реализовать метод, который принимает 3 параметра start, finish, digit типа int. digit
 находится в диапазоне (0<=digit<9), если нет, то считаем digit=0. Метод должен вернуть
 сумму всех чисел от start до finish исключая те числа, которые заканчиваются на digit.
 Например: sum(10,15,3) -> 62 (в данном случае, в сумму входят числа 10,11,12,14 и15.
 Число 13 не входит. )
 */

public class Main {

    public static void main(String[] args) {
        int start = 10;
        int finish = 15;
        int digit = 3;
        System.out.println(sumNumbersNoDig(start, finish, digit));
    }
    public static int sumNumbersNoDig(int start, int finish, int digit) {
        if (digit < 0 || digit > 9) digit = 0;
        int result = start;
        for (int i = start+1; i <=finish ; i++) {
            if (i % 10 !=digit) result+=i;
        }
        return result;
    }
}
