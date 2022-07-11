import java.util.Arrays;

public class MyQueue {
    private int[] arr;      // массив для хранения элементов queue
    private int head;      // head указывает на передний элемент в queue
    private int tail;       // tail часть указывает на последний элемент в queue
    private int capacity;   // максимальная емкость queue
    private int count;      // текущий размер queue

    public MyQueue(int size)
    {
        arr = new int[size];
        capacity = size;
        head = 0;
        tail = -1;
        count = 0;
    }

    public String getAll() {  // для проверки всех переменных
        return "head="+head+" tail="+tail+" count=" + count+" capacity=" + capacity;
    }
    public void printArr() {
        System.out.println(Arrays.toString(arr));
    }

    // прибавляю элементы по кругу, пока не закончится место (размер массива меньше)
    public void pushToEnd(int date){
        if(capacity == count){  // не хватает размера
            arr = increaseSize(arr);
        }
        count++;
        tail=(tail+1) % capacity;
        arr[tail] = date;
    }
    // увеличение массива в 2 раза и перезапись элементов с 1-й позиции
    public int[] increaseSize(int[] oldArr){
        int[] arr1 = new int[capacity*2];
        for (int i = 0; i < capacity; i++) {
            arr1[i]=oldArr[(head+i) % capacity]; // новый массив заполняем с 0 позиции, из старого берем по кругу
        }
        head = 0;
        tail = count-1;
        capacity *= 2;
        return arr1;
    }
    public void  remove(){   //удаляет элемент из начала queue
        if (count ==0){
            System.out.println("NoSuchElementException...");
            return;
        }
        arr[head] = 0;  // для удобства проверки, можно было не чистить
        head=(head+1) % capacity;
        count--;
        if (count == 0){
            head = 0;
            tail = 0;
        }
    }
    public int peek(){   //возвращает элемент из начала не удаляя его
        if (count ==0){
            System.out.println("NoSuchElementException...");
            return 0;
        }
        return arr[head];
    }
    public boolean isEmpty(){
        return (count==0);
    }

    public int size(){
        return count;
    }

}
