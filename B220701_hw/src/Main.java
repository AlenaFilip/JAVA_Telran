/*Допустим, вы пишите банковскую программу.
У вас есть клиенты: юридические лица, физические лица, вип-клиеты.
У каждого клиента есть Account{String ibann, double balance}.
Условиями бизнеса предусмотрено, что по каждому счету начисляются проценты и после начисления
клиентов информируют о балансе. На счета физических лиц проценты начисляется базовый процент.
На счета юр.лиц начисляется процент, но при условие что остаток на счете не менее 10000.
На счета вип-клиетов начисляется базовый процент плюс бонус.
Информирование тоже осуществляется по разному: юр.лица и физ.лица получают выписку письмом,
вип клиеты получают письмом и емэйлом. Вам необходимо разработать систему классов,
реализовать метод начисления и метод информирования.
Естественно, программа должна иметь возможность обрабатывать клиентов\счета списком.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        double baseRate = 2.3;  // базовая процентная ставка
        double bonusRate =0.5;  // процент - бонус
        double minBalanceForRate = 10000; // мин баланс для начисления процентов
        Client ci1 = new ClientIndividual("Ivanov Sergey",
                new Account("DE12345678", 52500.2));
        Client cli1 = new ClientLegalIntity("Firma Big money",
                new Account("DE10005678", 542500.2));
        Client cli2 = new ClientLegalIntity("Firma Little money",
                new Account("DE10088878", 4500.0));
        Client cvip1 = new ClientVIP("The VIP Client",
                new Account("DE100077700", 10000004.2));
        List<Client> list = Arrays.asList(new Client[] {ci1,cli1,cli2,cvip1});
        countInterestList(list, baseRate,bonusRate,minBalanceForRate);
        System.out.println("---------------");
        informBalanceList(list);
    }


    //  начиление процентов по списку клиентов
    public static void countInterestList (List<Client> clients,double rate, double bonus, double minBalance){
        for (Client cl: clients) {
            cl.chargeInterest(rate, bonus, minBalance);
        }
    }
    // информирование по списку клиентов
    public static void informBalanceList (List<Client> clients){
        for (Client cl: clients) {
            cl.informBalance();
        }
    }
}
