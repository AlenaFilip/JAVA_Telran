import java.util.Comparator;

public class byRaitingComparator implements Comparator<Film> {
    @Override
    public int compare(Film o1, Film o2) {
        return (int) (o1.getRating() - o2.getRating())*100;
    }
}
