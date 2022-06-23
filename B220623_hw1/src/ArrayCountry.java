import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ArrayCountry implements Iterable <Country>{
    private Country[] arrayCountry;
    private int size;
    private int count;

    public ArrayCountry( int capacity) {
        this.arrayCountry = new Country[capacity];
        this.size = capacity;
        this.count = 0;
    }

    public ArrayCountry( ) {
        this.arrayCountry = new Country[1];
        this.size = 1;
        this.count = 0;
    }

    public void add(Country country){
        if(size==count) grousize();
        arrayCountry[count] = country;
        count++;
    }

    public void grousize(){
        Country [] arr2 = new Country[size*2];
        for (int i = 0; i < size; i++) {
            arr2[i] = arrayCountry[i];
        }
        size *=2;
    }

    @Override
    public Iterator<Country> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Country> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Country> spliterator() {
        return Iterable.super.spliterator();
    }

    public Country next(){

    }
}
