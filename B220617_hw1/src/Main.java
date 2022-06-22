/*  Пусть дан список List объектов типа User{String fName, String lName, int age }.
Предположим, при чтение User-ов из базы данных случилась ошибка
и у всех пользователей из списка поменялись местами fName и lName.
Необходимо написать метод, который исправит данную ситуацию. */

/*Пусть дан список List объектов типа User{String fName, String lName, int age }.
Необходимо исключить из списка всех пользователей моложе 18 лет. */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        User us1 = new User("Popova","Anna", 35);
        User us2 = new User("Sidirov","Ivan", 17);
        User us3 = new User("Mironov","Petr", 4);
        User us4 = new User("Kuznecova","Irina", 62);
        List<User> users = new ArrayList<>();
        users.add(us1);
        users.add(us2);
        users.add(us3);
        users.add(us4);
        for (User u: users) {
            System.out.println(u);
        }
        changeFirstLastName(users);
        System.out.println("------------ after correction _______________");
        for (User u: users) {
            System.out.println(u);
        }
/*Пусть дан список List объектов типа User{String fName, String lName, int age }.
Необходимо исключить из списка всех пользователей моложе 18 лет. */
        removeLessAge18(users);
        System.out.println("------------ after DELETE _______________");
        for (User u: users) {
            System.out.println(u);
        }
    }

    public static void changeFirstLastName(List<User> usrs){
        for (User u: usrs) {
            String tmp = u.getfName();
            u.setfName(u.getlName());
            u.setlName(tmp);
        }
    }

    public static void removeLessAge18(List<User> usrs){
        for (int i = 0; i < usrs.size(); i++) {
            if (usrs.get(i).getAge()<18) {
                usrs.remove(i);
                i--;
            }
        }
    }
}
