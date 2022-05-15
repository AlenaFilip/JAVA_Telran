/* 13. Реализовать метод, который печатает заданную строку, при этом каждый символ печатается
        в [] Например: “Hello” -> [H][e][l][l][o]
 */

public class Main {

    public static void main(String[] args) {
        String str = "Hello";
        printStrWithBox(str);
    }

    public static void printStrWithBox(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.print("["+str.charAt(i)+"]");
        }
    }
}
