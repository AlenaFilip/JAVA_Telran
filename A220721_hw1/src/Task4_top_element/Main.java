package Task4_top_element;

/*4* Найдите пиковый элемент в двумерном массиве
Элемент является пиковым, если он больше или равен своим четырем соседям слева, справа, сверху и снизу.
Например, соседями для A[i][j] являются A[i-1][j], A[i+1][j], A[i][j-1] и A[i][j+1 ].
Для угловых элементов отсутствующие соседи считаются отрицательными бесконечными значениями.
10 20 15
21 30 14
 7 16 32
Выход: 30
30 — пиковый элемент, потому что все его
соседи меньше или равны ему.
32 также можно выбрать в качестве пика.
note
1 Смежная диагональ не считается соседней.
2 Пиковый элемент не обязательно является максимальным элементом.
3 Таких элементов может быть несколько.
4 Всегда есть пиковый элемент. */

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 15, 14},
                {21, 30, 14, 11},
                {7, 40, 32, 47},
                {41, 55, 21, 6},
                {1, 55, 24, 69}};
// метод только для прямоугольного массива
        System.out.println(topElement(arr));
    }
    public static String topElement(int[] [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || arr[i - 1][j] < arr[i][j]) {  // прошли проверку по элементу сверху
                    if (i == arr.length - 1 || arr[i + 1][j] < arr[i][j]) {// прошли проверку снизу
                        if (j == 0 || arr[i][j - 1] < arr[i][j]) {  // прошли проверку по элементу слева
                            if (j == arr[i].length - 1 || arr[i][j + 1] < arr[i][j]) {// прошли справа
                                return "Пиковый элемент " + arr[i][j] + " ,координаты " + i + " , " + j;
                            }
                        }
                    }
                }
            }
        }
        return "";
    }
}
