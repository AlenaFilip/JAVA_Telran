package TransformerInterfaces;
//Дана строка, сосотоящая из нескольких слов разделенных пробклом.
// Написать метод, позволяющий изменять слова в строке так:
// при длине слова = 3, изменить все буквы слова на заглавные
// при длине слова = 4, изменить все буквы слова на строчные
// при длине слова = 5, изменить все буквы слова на звездочки
// "aaa bbbb BBBb ccc dddddd dRgHd"

import transformer.TransformToLower;
import transformer.TransformToStars;
import transformer.TransformToUpper;

public class WordsTransformer {

    public static void main(String[] args) {

        String input = "aaa BBBb cDvCn ddddddddd";

        WordChecker upperCaseChecker = new UpperCaseChecker();
        System.out.println(transformer(input, upperCaseChecker));

        WordChecker lowerCaseChecker = new LowerCaseChecker();
        System.out.println(transformer(input, lowerCaseChecker));

        WordChecker starChecker = new StarChecker();
        System.out.println(transformer(input, starChecker));

    }


    public static String transformer (String string, WordChecker wordChecker){
        String[] words = string.split(" "); // split unterteilt den String anhand der darauf folgenden Angabe

        for (int i = 0; i < words.length; i++) {
            if (wordChecker.check(words[i])) {
                words[i] = wordChecker.transform(words[i]);
            }
        }
        return String.join(" ", words);     // join macht hier split wieder rückgängig
    }

}
