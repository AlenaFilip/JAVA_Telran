/*
Реализовать метод boolean isEven(int number) который возвращает true если переданное
число четное иначе возвращает false. Реализовать метод void printCheckResultMessage(int
number, boolean result) который выводит на экран строку вида «10 это четное число» или
"15 это не четное число»
Подсказка: Используем конструкцию if и оператор % modulo
 */

public class Main {
    public static void main(String[] args) {
        int number = 141;
        printCheckResultMessage(number);  //  -  надо в метод отправить параметр - число
    }

    public static boolean isEven(int number){
        return (number % 2==0);
    }

    public static void printCheckResultMessage(int number) {
        System.out.println(number + " это "+ ((isEven(number)) ? "": "не") +"четное число");
    }
}
