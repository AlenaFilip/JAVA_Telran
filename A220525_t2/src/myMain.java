
/*Напишите метод, который добавляет 1000000 элементов
в ArrayList и LinkedList.

Напишите еще один метод, который выбирает из
заполненного списка элемент наугад 100000 раз.
Замерьте время, которое потрачено на это.


  The result is:
        Time for ArrayList: 16
        Time for LinkedList: 403476
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // make ArrayList and field 1 000 000 elements
        ArrayList<String> numbArr = new ArrayList<>();
        numbArr = appMilionInArrayList(1000000);
        // make LinkedList and field 1 000 000 elements
        LinkedList<String> numbLink = new LinkedList<>();
        numbLink = appMilionInLinkedList(1000000);
        Date date1 = new Date(); // save the time befor selecting elements
        // select random 100 000 elements in ArrayList
        genRandomArray(numbArr,100000);
        Date date2 = new Date(); // save the time after selecting elements
        Integer int1 = (int)(date2.getTime() - date1.getTime()); // print differens in Array
        System.out.println("Time for ArrayList: "+int1);
        Date date3 = new Date();
        // select random 100 000 elements in LinkedList
        genRandomLinked(numbLink,100000);
        Date date4 = new Date();
        Integer int2 = (int)(date4.getTime() - date3.getTime()); // print differens in Array
        System.out.println("Time for LinkedList: "+int2);
    }
    // make ArrayList and field 1 000 000 elements
    public static ArrayList appMilionInArrayList(int capacity){
        ArrayList<String> myArray = new ArrayList<>(capacity);
        for (Integer i = 0; i < capacity; i++) {
            myArray.add(i.toString());
        }
        return myArray;
    }

    // make LinkedList and field 1 000 000 elements
    public static LinkedList appMilionInLinkedList(int capacity){
        LinkedList<String> myLink = new LinkedList<>();
        for (Integer i = 0; i < capacity; i++) {
            myLink.add(i.toString());
        }
        return myLink;
    }

    // select random 100 000 elements in ArrayList
    public static void genRandomArray(ArrayList list, int number){
        for (int i = 0; i < number; i++) {
            double numb = Math.random()*1000000;
            Integer n = (int) numb;
            list.get(n);
        }
    }

    // select random 100 000 elements in LinkedList
    public static void genRandomLinked(LinkedList list, int number){
        for (int i = 0; i < number; i++) {
            double numb = Math.random()*1000000;
            Integer n = (int) numb;
            list.get(n);
        }
    }

}
