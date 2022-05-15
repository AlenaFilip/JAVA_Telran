/* Given arrays String[] names and int[ ] yearsOfBirthday of the same length,
   that contains names and years of birthday of the persons.
   Every element in yearsOfBirthday is corresponding with element at the same index in names.
        Implement the program that prints the name and the age of all person
        who older that given int. Than print the name and age of oldest person.
        For example: ({“Olga”,”Oleg”,”Svetlana”,”Oleg”} , {2004,1982,2008,2010},15) ->
        Olga 18 years
        Oleg 40 years
        Oleg 40 years is oldest
 */

public class Main {

    public static void main(String[] args) {
        String[] arrnm = {"Olga","Oleg","Svetlana","Oleg"};
        int[] arrye = {2004,1982,2008,2010};
        printOlderThenNum(arrnm ,arrye,15);
    }
    public static void printOlderThenNum(String[] arrName, int[] arrYear, int minAge){
        int minYear = 2222;
        int numMinYear = 0;
        int arrLng = arrName.length;
        for (int i = 0; i < arrLng; i++) {
            int age = 2022-arrYear[i];
            if (age>minAge){
                System.out.println(arrName[i]+" "+age+" years");
            }
            if (minYear>arrYear[i]){
                minYear = arrYear[i];
                numMinYear = i;
            }
        }
        int oldestAge = 2022 - minYear;
        System.out.print(arrName[numMinYear]+" "+oldestAge+" years is oldest");
    }
}
