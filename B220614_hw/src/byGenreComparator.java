import java.util.Comparator;

public class byGenreComparator implements Comparator<Film> {
    @Override
    public int compare(Film o1, Film o2) {
        return o1.getGenre().getGenre() - o2.getGenre().getGenre();
    }
}
