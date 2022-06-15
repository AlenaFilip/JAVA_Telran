import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Genre g1 = new Genre(1);
        Genre g2 = new Genre(2);
        Genre g3 = new Genre(3);
        Genre g4 = new Genre(4);
        Genre g5 = new Genre(5);
        List<Film> films = new ArrayList();
        films.add(new Film("A ciascuno il suo",4.5, g1, 1974));
        films.add(new Film("The Sugarland Express",3.2, g2, 1999));
        films.add(new Film("Mephisto",4.5, g4, 1987));
        films.add(new Film("Moonlighting",4.5, g5, 2004));
        films.add(new Film("La terrazza",4.9, g3, 2015));
        films.add(new Film("Aaa",8.0, g1, 1990));
        films.add(new Film("Aaa",7.0, g4, 2021));
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose sort: 1 - by name");
        System.out.println("             2 - by rating");
        System.out.println("             3 - by genre");
        System.out.println("             4 - by year");
        int choice = sc.nextInt();
        switch (choice){
            case 1: films.sort(new byNameComparator()); break;
            case 2: films.sort(new byRaitingComparator()); break;
            case 3: films.sort(new byGenreComparator()); break;
            case 4: films.sort(new byYearComparator()); break;
            default: films.sort(new byNameComparator()); break;
        }
        for (Film f: films) {
            System.out.println(f);
        }

    }

}
