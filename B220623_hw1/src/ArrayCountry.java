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

    public ArrayCountry(Country[] arrayCountry) {
        this.arrayCountry = arrayCountry;
        this.size =arrayCountry.length;
        this.count = arrayCountry.length;
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
        arrayCountry = arr2;
        size *=2;
    }

    @Override
    public Iterator<Country> iterator() {
        return new ArrayCountryIterator() ;
    }

    public class ArrayCountryIterator implements Iterator {
        private int numb = 0;

        public Country next(){
            return arrayCountry[numb++];
        }

        public boolean hasNext(){
            return numb<size;
        }
    }


}
