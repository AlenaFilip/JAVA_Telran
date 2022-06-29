package transformer;
//Дана строка, сосотоящая из нескольких слов разделенных пробклом.
// Написать метод, позволяющий изменять слова в строке так:
// при длине слова = 3, изменить все буквы слова на заглавные
// при длине слова = 4, изменить все буквы слова на строчные
// при длине слова = 5, изменить все буквы слова на звездочки
// "aaa bbbb BBBb ccc dddddd dRgHd"

import TransformerInterfaces.StarChecker;
import TransformerInterfaces.WordChecker;

public class Main {
    public static void main(String[] args) {


        String input = "aaa BBBb cDvCn ddddddddd";


        WordsTransformer toUpperCase = new TransformToUpper();
        System.out.println(transformer(input, toUpperCase));

        WordsTransformer toLowerCase = new TransformToLower();
        System.out.println(transformer(input, toLowerCase));

        WordsTransformer toStars = new TransformToStars();
        System.out.println(transformer(input, toStars));

        System.out.println(transformer(transformer(transformer(input,toUpperCase),toLowerCase), toStars));

    }

    public static String transformer(String string1, WordsTransformer trans1) {

        String[] words = string1.split(" "); // split unterteilt den String anhand der darauf folgenden Angabe

        for (int i = 0; i < words.length; i++) {
            if (trans1.check(words[i])) {
                words[i] = trans1.transform(words[i]);
            }
        }
        return String.join(" ", words);     // join macht hier split wieder rückgängig
    }

}
