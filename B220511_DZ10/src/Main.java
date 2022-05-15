/*10. Реализовать метод, который int findLastCharIndex(String str, char ch) который возвращает
позицию последнего вхождения (индекс) символа ch в строке str. Если символа в строке
нет, возвращаем -1.
Например: find(“let’s talk about java”,’t’) -> 15
 */

public class Main {
    public static void main(String[] args) {
        String str = "let’s talk about java";
        char ch = 't';
        System.out.println(findFirstCharIndex(str, ch));
    }
    public static int findFirstCharIndex(String str, char ch){
        int res = -1;
        for (int i = str.length()-1; i>=0; i--) {
            if (str.charAt(i) == ch){
                res = i;
                break;
            }
        }
        return res;
    }
}
