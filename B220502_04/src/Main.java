import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String str="Java is very easy!";
        char charSplit = ' ';
        int amount = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == charSplit) amount++;
        }
        String [] arr = new String[amount+1];
        String myWord = "";
        amount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == charSplit){
                arr[amount] = myWord;
                myWord = "";
                amount++;
            }
            else myWord = myWord + str.charAt(i);
        }
        if (myWord.length()>0) arr[amount] = myWord;
        printArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void printArray(String[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("["+i+"]="+ arr[i]+"  ");
        }
        System.out.println();
    }
}
