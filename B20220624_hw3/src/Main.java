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
        User u41 =new User("Katya","Potapova","   ");
        User u42 =new User("Katya","Pitapova"," dd  ");
        User u5 =new User("Ivan","Ivanov","email5");
        List<User> list1 = Arrays.asList(new User[] {u1, u3,u4,u5});
        List<User> list2 = Arrays.asList(new User[] {u1, u2,u2,u4,u41});
        List<User> list3 = Arrays.asList(new User[] {u1, u1,u5});
        Set<String> listEmails = new HashSet<>();
        listEmails = createListEmails(listEmails,list1);
        listEmails = createListEmails(listEmails,list2);
        listEmails = createListEmails(listEmails,list3);
        for (String l : listEmails) {
            System.out.println(l);
        }
        String s1 = "aaa";
        String s2 = "aaa";
        s2=s2+"1";
        System.out.println(s1==s2);
        System.out.println(u41.getfName()==u42.getfName());
        s1="aaAaa";
        s2="aaaaa";
        System.out.println(s1==s2);
        System.out.println(s1.equalsIgnoreCase(s2));
    }

    // добавляю в Set String - email, проверив на null и наличие "@"
    public static Set<String> createListEmails(Set<String> set, List<User> lst){
        for (User u: lst) {
            if (u.getEmail()!=null && u.getEmail().contains("@")) set.add(u.getEmail());
        }
        return set;
    }
}
