/*21. *Дано два массива int. Написать метод, который считает, сколько значений из первого
массива присутствуют во втором. Например: {10, 14,1,4,3}, {0,1, 6,10, 1,4,13} ->3
 */

public class Main {

    public static void main(String[] args) {
        int[] arr1 = {10, 14,1,4,3};
        int[] arr2 = {0,1, 6,10, 1,4,13};
        System.out.println(numbCoins1In2(arr1, arr2));
    }
    public static int numbCoins1In2(int[] arr1, int[] arr2){
        int result = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    result++;
                    break;
                }
            }

        }
        return result;
    }
}
