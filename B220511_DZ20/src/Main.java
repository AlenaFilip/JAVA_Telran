/*20. Дано два массива char одинаковой длинны. Написать метод, который выводит все символы,
которые совпадают и имеют одинаковые индексы и в первом и во втором массиве.
Например: {‘a’,’b’,’c’,’d’}, {‘d’,’b’,’c’,’f’} ->bc
 */

public class Main {
    public static void main(String[] args) {
        char[] arr1 = {'a','b','c','d'};
        char[] arr2 = {'d','b','c','f'};
        printEqualSimb(arr1, arr2);
    }
    public static void printEqualSimb(char [] arr1, char [] arr2){
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                System.out.print(arr1[i]);
            }
        }
    }
}
