public class Main {

    public static void main(String[] args) {
        String[] arr = {"dfww111","jfjf","45","fff   tye   976"};
        String fromArr = arr[0];
        int minNum = 0;
        int minLng = fromArr.length();
        for (int i = 1; i < arr.length; i++) {
            fromArr = arr[i];
            if (fromArr.length()<minLng){
                minNum = i;
                minLng = fromArr.length();
            }
        }
        System.out.println(arr[minNum]);
    }
}
