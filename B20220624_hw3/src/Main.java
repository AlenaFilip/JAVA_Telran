import java.util.*;

/*  Дано несколько списков User-ов{fFame, lName, email},
необходимо написать метод, который подготовит список всех email-ов для рассылки
 */
public class Main {

    public static void main(String[] args) {
        User u1 =new User("Ivan","Ivanov","hbhjbhd@kmkmk");
        User u2 =new User("Petya","Petrov","petya@dmx");
        User u3 =new User("Ivanov");
        User u4 =new User("Katya","Potapova","katya@tut.by");
        User u5 =new User("Ivan","Ivanov","email5");
        List<User> list1 = Arrays.asList(new User[] {u1, u3,u4,u5});
        List<User> list2 = Arrays.asList(new User[] {u1, u2,u2,u4});
        List<User> list3 = Arrays.asList(new User[] {u1, u1,u5});
        Set<String> listEmails = new HashSet<>();
        listEmails = createListEmails(listEmails,list1);
        listEmails = createListEmails(listEmails,list2);
        listEmails = createListEmails(listEmails,list3);
        for (String l : listEmails) {
            System.out.println(l);
        }

    }

    public static Set<String> createListEmails(Set<String> set, List<User> lst){
        for (User u: lst) {
            if (u.getEmail()!=null) set.add(u.getEmail());
        }
        return set;
    }
}
