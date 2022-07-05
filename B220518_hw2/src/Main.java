/* Implement the method that takes int[][] array and row index and checks
 if the average of the elements in the row is greater than 0
 */
public class Main {

    public static void main(String[] args) {
        int [][] arr = {{-80,4,32,-75,0},{1,5,6,-8,-2,-7,23,-9},{1,44,-95,8,96,32,44,-25}};
        System.out.println((moreNull(arr,2)? "Больше 0":"Не больше нуля"));
    }
    public static boolean moreNull(int [] [] arr, int indx){
        long midl = 0;
        for (int i = 0; i < arr[indx].length; i++) {
            midl+=arr[indx][i];
        }
        return  (midl >0)?true:false;
    }
}
