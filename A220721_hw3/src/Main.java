/*  3. Имея отсортированный массив arr[] и число x, напишите функцию, которая подсчитывает
вхождения x в arr[]. Ожидаемая временная сложность O(Log n)
arr[] = {1, 1, 2, 2, 2, 2, 3,}
x = 2
Вывод: 4 раза   */
public class Main {

    public static void main(String[] args) {
        int[] arr = {0,1,1,1,2,2,5,5,6,6,6,6,10,10,123};
        int x = 500;
        int positionX = findPosition(arr,x,0,arr.length-1);
        // рекурсией находим любую позицию х в массиве
        System.out.println(x+" находится на позиции "+positionX);
        if (positionX==-1){
            System.out.println("Значение "+ x+" не встречается в массиве");
        } else{
            int count = 1;
            int i=1;
            while (positionX-i>0) {  // проверяем элементы слева
                if(arr[positionX-i]==x){
                    count++;
                    i++;
                } else {
                    break;
                }
            }
            i=1;
            while (positionX+i< arr.length) {  // проверяем элементы справа
                if(arr[positionX+i]==x){
                    count++;
                    i++;
                } else {
                    break;
                }
            }
            System.out.println("Количество "+ x+" в массиве: "+count);
        }
    }

    // если находим элемент - возвращаем его позицию
    // иначе делим массив пополам и проверяем левую или правую часть на вхождение
    public static int findPosition(int[] arr,int x,int left, int right){
        if (left == right){
            if(arr[left]==x) return left;
            return -1;
        }
        if (arr[left]==x) return left;
        if (arr[right]==x) return right;
        if (arr[left]>x || arr[right]<x) return -1;
        int midl = left+(right-left)/2;
        // рекурсия по левой или правой части
        if(x<=arr[midl]){
            return findPosition(arr,x,left,midl);
        } else {
            return findPosition(arr,x,midl+1,right);
        }
    }
}
