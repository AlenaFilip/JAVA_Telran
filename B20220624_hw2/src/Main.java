import java.util.*;

/* Дан список User<name, email>, необходимо написать метод, который определит,
есть ли в списке дубли.  */
public class Main {

    public static void main(String[] args) {
        User u1=new User("Puchko","puchko@gmx.de");
        User u2=new User("Puchko");
        User u3=new User("Ivanov","ivanov@gmail.com");
        User u4=new User("Petrov");
        User u5=new User("Sidorov","sidirov@gmx.de");
        User u6=new User("Sidorov","sidirov@gmx.de");
        List<User> users = Arrays.asList(new User[]{u1,u2,u3,u4,u5,u6,u3,u4});
        for (User u: users) {
            System.out.println(u);
        }
        System.out.println("-------------------");
        System.out.println((isDouble(users)? "There is double": "There is no double"));
    }

    public static boolean isDouble(List<User> usr){
        Set<User> userSet = new HashSet<>(usr);
        for (User u:userSet) {
            System.out.println(u);
        }
        return usr.size()!=userSet.size();
    }
}
