/*  Задача 4
Реализовать метод int max3(int num1, int num2, int num3) который возвращает число,
        наибольшее из трех переданных чисел:
---------------- Задача 5 -----------------------------------
Реализовать метод String longestString (String str1, String str2, String str2) который
возвращает самую длинную строку из трех заданных строк:
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(maxOfNumber3(345,55,-8));   //   Задача 4
        String str1 = "java";
        String str2 = "welcome";
        String str3 = "hello";
        System.out.println(maxOfStr3(str1,str2,str3));   //   Задача 5
    }
    public static int maxOfNumber3(int num1, int num2, int num3){
        int result = num1;
        result = (num2>result) ? num2: result;
        result = (num3>result) ? num3: result;
        return result;
    }
    public static String maxOfStr3(String str1, String str2, String str3){
        int maxLng = maxOfNumber3(str1.length(), str2.length(), str3.length());
        if (maxLng == str1.length()) return str1;
        if (maxLng == str2.length()) return str2;
        return str3;
    }
}
