public class Genre {
    private int genre;

    public Genre(int genre) {
        this.genre = genre;
    }

    public int getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        switch (genre){
            case 1: return "Science fiction";
            case 2: return "Horror";
            case 3: return "Documentary";
            case 4: return "Animation";
            default: return "Drama";
        }
    }
}
