import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Given a List . Implement a method that will remove all adjacent identical characters, leaving only one.
        //For example: {a,b,c,c,b,a,a,a,f} -> {a,,b,c,a,f}
        List<Character> array = new ArrayList<>();
        array.add('a');     array.add('b');     array.add('c');     array.add('c');     array.add('b');
        array.add('a');     array.add('a');     array.add('a');     array.add('f');
        //  System.out.println(array);
        System.out.println(removeIdenticalChars(array));
    }
    public static List<Character> removeIdenticalChars(List<Character> array) { //длина входящего Листа = 9;
        for (int i = 0; i < array.size() - 1; i++) { // -> цикл доходит не до последнего елемента? как тогда он забирает символ f?
            if (array.get(i).equals(array.get(i + 1))) { //раз не доходит до последнего символа, как он проверяет что он не равен предыдущему
                array.remove(i+1); //
                i--;
            }
        }
        for (int i = 0; i < array.size() - 2; i++) {
            if (array.get(i).equals(array.get(i + 2))) {
                array.remove(i+2);
                i--;
            }
        }return array;
    }
}
