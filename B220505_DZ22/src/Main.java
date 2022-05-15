/*22. Допустим, дан массив int, каждое значение в котором лежит в диапазоне от 0 до 9.
Реализовать метод, который вернет число long, которое поразрядно состоит из элементов
заданного массива
Например: {1,3,7} -> 137
 */

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,3,7};
        System.out.println(arrToLong(arr));
    }
    public static long arrToLong(int[] arr){
        long result = 0l;
        for (int i = 0; i < arr.length; i++) {
            result = result*10+arr[i];
        }
        return result;
    }
}
