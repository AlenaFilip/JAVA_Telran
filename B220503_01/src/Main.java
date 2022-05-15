//Implement the method that print the String, which consists of given char of the given source string and repeated as many times as the given character occurs in the source string
//        “It’s new task for me”,’e’ -> “ee”;
//  ниже - 2 варианта решения

public class Main {
    public static void main(String[] args) {
        printChars('a',countCharsInTheString("It's new task for me",'e'));
    }
    public static int countCharsInTheString(String str, char ch){
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==ch){
                result++;
            }
        }
        return result;
    }
    public static void printChars(char ch, int count){
        for (int i = 0; i < count; i++) {
            System.out.print(ch);
        }
        System.out.println();
    }
}

//public class Main {
//
//    public static void main(String[] args) {
//        printStringByChar("It's new task for me",'e');
//
//    }
//    public static void printStringByChar(String str, char ch){
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i)==ch) System.out.print(ch);
//        }
//    }
//}
