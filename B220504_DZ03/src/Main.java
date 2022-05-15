/*  3. Реализовать метод, который в качестве параметров получает 3 числа типа инт. Метод
должен возвращать true если и первое и второе число делятся без остатка на третье.
Подсказка: Используйте метод, написанный в пункте 2
*/


public class Main {

    public static void main(String[] args) {
        int num1 = 51;
        int num2 = 27;
        int num3 = 3;
//        System.out.println(isDivisibleBoth(num1, num2, num3))?"is divisible":"is not divisible");
        System.out.println(isDivisibleBoth(num1, num2, num3));
	// write your code here
    }
    public static boolean isDivisibleBoth(int number1, int number2,int number3) {
        if (isDivisible(number1, number3)){
            if (isDivisible(number2, number3)){
                return true;
            }
        }
        return false;
    }
    public static boolean isDivisible(int number1, int number2) {
        return (number2 != 0 && number1 % number2 == 0);
    }
}
