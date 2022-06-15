public class Film {
    private String name;
    private double rating;
    private Genre genre;
    private int year;

    public Film(String name, double rating, Genre genre, int year) {
        this.name = name;
        this.rating = rating;
        this.genre = genre;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return name + ", rating " + rating +" " + genre.toString() + ", " + year +" year";
    }
}
