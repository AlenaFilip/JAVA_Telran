/* ханойская башня -  методом рекурсии
* сначала - мой вариант, потом - лучше, препода
* */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n - length of sorted array");
        int n = sc.nextInt();
        Stack<Integer> left = new Stack<>();
        Stack<Integer> midl = new Stack<>();
        Stack<Integer> right = new Stack<>();
        for (int i = n; i >0; i--) {
            left.push(i);
        }
        int cnt = 0;
        System.out.println("Left: "+left);
        System.out.println("Midl: "+midl);
        System.out.println("Right: "+right);
        cnt = recursHanoy(n, left , right, midl, cnt);
        System.out.println("--------------");
        System.out.println("Left: "+left);
        System.out.println("Midl: "+midl);
        System.out.println("Right: "+right);
        System.out.println("Counter =" + cnt);
    }
    public static int recursHanoy(int n , Stack<Integer> fromSt ,Stack<Integer> toSt, Stack<Integer> tmp, int cnt){
        if (n==1){
            toSt.push(fromSt.pop());
            cnt++;
            return cnt;
        }
        else{
            cnt = recursHanoy(n-1, fromSt, tmp, toSt , cnt);
            toSt.push(fromSt.pop());
            cnt++;
            cnt = recursHanoy(n-1, tmp, toSt, fromSt, cnt);
        }
        return cnt;
    }
}
//*********************************************************************
/*

public class Main {
    public static void main(String[] args) {
        int countOfDisk = 5;
        String source = "source";
        String helper = "helper";
        String destination = "destination";

        towerOfHanoiRecursion(countOfDisk, source, helper, destination);
    }

    private static void towerOfHanoiRecursion(int countOfDisk, String source, String helper, String destination) {
        // Переместить «n-1» диск с «source» на «helper», используя -> destination.
        // Переместить последний диск с «source» на «destination».
        // Переместить «n-1» диск с «helper» на «destination», используя -> source.

        if (countOfDisk == 0) {
            return;
        }

        towerOfHanoiRecursion(countOfDisk - 1, source, destination, helper);
        printMove(countOfDisk, source, destination);
        towerOfHanoiRecursion(countOfDisk - 1, helper, source, destination);
    }

    private static void printMove(int disk, String src, String dest) {
        System.out.println("Move the disk " + disk + " from " + src + " to " + dest);
    }
}

*/
 