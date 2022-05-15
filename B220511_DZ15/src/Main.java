/*15. Представьте, что вы пишите банковскую программу. Вам нужно реализовать метод,
который вместо заданной строки с номером счета (например ”DE5128279087265”)
возвращает строку вида ”DE51*********65” (количество звездочек соответствует количеству
засекреченных цифр)
 */


public class Main {

    public static void main(String[] args) {
        String str ="DE5128279087265";
        System.out.println(secretCode(str));
    }
    public static String secretCode(String str){
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            res = res + ((i < 4 || i > str.length()-3)? str.charAt(i): "*");
        }
        return res;
    }
}
