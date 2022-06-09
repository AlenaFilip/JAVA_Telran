/*  Create an array of Person (firstName, lastName, age).
Sort the by Person’s age using the Arrays.sort() method.
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Semeon", "Petrov", 36);
        Person p2 = new Person("Olya", "Petrova", 18);
        Person p3 = new Person("Lena", "Telz", 5);
        Person p4 = new Person("Andrei", "Petuchov", 98);
        Person[] persons = {p1,p2,p3,p4};
        System.out.println(Arrays.toString(persons));
        Arrays.sort(persons);
        for (Person p: persons) {
            System.out.println(p);
        }
    }
}
