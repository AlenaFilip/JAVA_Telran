/* 2 Реализовать метод boolean isDivisible(int number1, int number2) который возвращает
        true если number1 делится на number2 без остатка. Аналогично первой задаче
        реализовать метод печати результата.
*/


public class Main {

    public static void main(String[] args) {
	    int numb1 = 21;
        int numb2 = 0;
        System.out.println(numb1+" is "+((isDivisible(numb1,numb2)) ? "":"not")+" devisible by "+numb2+" without remeinder.");
    }
    public static boolean isDivisible(int number1, int number2){
        return (number2 !=0 && number1 % number2 == 0);
    }
}
