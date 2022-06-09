public class DynamicArray implements Dynamic {

    private int[] array;
    private int count;
    private int size;

    public DynamicArray() {
        this.array = new int[1];
        this.count = 0;
        this.size = 1;
    }

    public DynamicArray(int capacity) {
        this.array = new int[capacity];
        this.count = 0;
        this.size = capacity;
    }

    @Override
    public void add(int data) {
        // check no of elements is equal to size of array
        if (count == size) {
            growSize(); // make array size double
        }
        array[count] = data;
        count++;
    }

    @Override
    public void addAt(int index, int data) {
        // check no of elements is equal to size of array
        if (index>count || index<0) return;
        if (count == size) {
            growSize(); // make array size double
        }
        count++;
        for (int i = count-1; i > index; i--) {
            array[i] = array[i-1];
        }
        array[index] = data;
    }

    @Override
    public int get(int index) {
        // return element number index
        if (index>count-1 || index<0) return 0;
        return array[index];
    }

    @Override
    public void remove() {
        //  delete the last element of the array
        array[count-1] = 0;
        count--;
    }

    @Override
    public void removeAt(int index) {
        //  delete the element number index of the array
        for (int i = index; i < count; i++) {
            array[i] = array[i+1];
        }
        array[count-1] = 0;
        count--;
    }

    @Override
    public void growSize() {
        // make array size double
        size = size *2;
        int[] array1 = new int[size];
        for (int i = 0; i < count; i++) {
            array1[i] = array[i];
        }
        array = array1;
    }

    @Override
    public void shrinkSize() {
        // reduces the size of the array to the number of elements +1
        if (size>count+1){
            size = count +1;
            int[] array1 = new int[size];
            for (int i = 0; i < size; i++) {
                array1[i] = array[i];
            }
            array = array1;
        }
    }

    @Override
    public void set(int index, int data) {
        // writes data to the position index
        if (index == count) {
            add(data);
        }
        else if(index < count && index>=0){
            array[index] = data;
        }
    }

    @Override
    public void clear() {
        // make empty array
        for (int i = 0; i < count; i++) {
            array[i] = 0;
        }
        count = 0;
    }

    @Override
    public void contains(int data) {
        // make all elements of array = data
        // этот метод не возвращает ничего, поэтому я решила что это заполнение массива,
        // а не поиск вхождения
        for (int i = 0; i < count; i++) {
            array[i] = data;
        }
    }

    @Override
    public boolean isEmpty() {
        // return true if alle elements = 0 or count = 0
        if (count == 0) return true;
        boolean allIs0 = true;
        for (int i = 0; i < count; i++) {
            if (array[i] != 0){
                allIs0 = false;
                break;
            }
        }
        return allIs0;
    }
}
