/*12. Реализовать метод, который возвращает длину общего постфикса двух строк, т.е. сколько
символов начиная с конца одинаковые у обеих строк.
 */

public class Main {

    public static void main(String[] args) {
        String str1="a_kninf  _4__qwe";
        String str2="dnnjn iu uuih u   _ we";
        System.out.println(lngPostfix(str1,str2));
    }
    public static int lngPostfix(String str1, String str2){
        int minLength = (str1.length() > str2.length()) ? str2.length() : str1.length();
        int result = 0;
        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(str1.length()-i-1);
            char ch2 = str2.charAt(str2.length()-i-1);
            if (ch1 == ch2) {
                result++;
            } else {
                break;
            }
        }
        return result;
    }
}
