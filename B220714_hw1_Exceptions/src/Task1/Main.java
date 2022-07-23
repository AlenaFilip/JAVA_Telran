/*Есть List<String>. Все элементы в нем должны быть строки-целые числа вида “231”,
но некоторые данные повреждены (например, содержат символы).
Необходимо преобразовать данный список в List<Integer>.
При этом вывести на экран детализированный список «ошибок» т.е. в каких ячейках и какие значения
не были преобразованы.
Подсказка: необходимо использовать метод Integer.parseInt и обрабатывать его эксэпшены.*/

package Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> str = List.of("123","-748","+1","41 7","#44","777$");

        System.out.println(listInteger(str));
    }

    public static List<Integer> listInteger(List<String> str){
        List<Integer> lstInt = new ArrayList<>();
        if(str==null || str.isEmpty()) return lstInt;
        for (int i = 0; i < str.size(); i++) {
            try {
                lstInt.add(Integer.parseInt(str.get(i)));
            } catch (NumberFormatException e){
                System.out.println("Элемент списка N "+i+" <"+str.get(i)+"> не был добавлен в список");
            }
        }
        return lstInt;
    }
}
