/*  Реализовать банкомат - на входе сумма,
Выдать в основном максимальными купюрами, более мелкие - желательно по 1-4 штуки
Купюры по 100, 50, 20, 10, 5 -  можно менять
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int amount = 60;
// дано - какие купюры имеются
        int[] moneyBills = {100, 50, 20, 10, 5};
// и их наличие в банкомате
        int[] billsCount = {100000, 500, 12, 0, 14111};
// если не кратно самой мелкой купюре - уменьшаем сумму до ближайшего кратного
        int small = moneyBills[moneyBills.length-1];
        amount = amount - (amount % small);
        int [] countBill = countMoneyBill(moneyBills, billsCount, amount);
        printATMresult(moneyBills, countBill, amount);
    }
    public static int[] countMoneyBill(int[] moneyBills,int[] billsCount, int amount){

        int size = moneyBills.length;
        int[] result = new int[size];
//  выделяем все купюры по 1
        for (int i = size-1; i >=0 ; i--) {
            if (amount >= moneyBills[i] && billsCount[i]>0){
                result[i] = 1;
                amount-=moneyBills[i];
                billsCount[i]--;
            }
        }
// распределяем остаток на минимальное колво купюр
        for (int i = 0; i < size; i++) {
            int bill = moneyBills[i];
            int numb = amount / bill ;
            numb = (numb <= billsCount[i])? numb : billsCount[i];
            result[i] = result[i] + numb;
            billsCount[i] -= numb;
            amount = amount - bill*numb;
        }
        return result;
    }
    public static void printATMresult(int[] moneyBills, int[] countBill,int amount){
        System.out.println("Сумма к выдаче: "+amount);
        for (int i = 0; i < moneyBills.length; i++) {
            if (countBill[i] != 0){
                System.out.println(countBill[i]+" купюр по "+moneyBills[i]);
            }
        }
    }
}

