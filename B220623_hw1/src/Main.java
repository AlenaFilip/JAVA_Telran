import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Country cn1 = new Country("Belarus",9000000);
        Country cn2 = new Country("Russia",140000000);
        Country cn3 = new Country("Ukraina",40000000);
        Country cn4 = new Country("Germany",93000000);

        ArrayCountry arc = new ArrayCountry();
        arc.add(cn1);
        arc.add(cn2);
        arc.add(cn3);
        arc.add(cn4);

        Iterator<Country> iterator = arc.iterator();


    }
}
