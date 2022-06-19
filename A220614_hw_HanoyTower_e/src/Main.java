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
        cnt = norecursHanoy(n, left , right, midl, cnt);
        System.out.println("--------------");
        System.out.println("Left: "+left);
        System.out.println("Midl: "+midl);
        System.out.println("Right: "+right);
        System.out.println("Counter =" + cnt);
    }

    public static int norecursHanoy(int n , Stack<Integer> fromSt ,Stack<Integer> toSt, Stack<Integer> tmpSt, int cnt){
        for (int i = 1; i <= n; i++) {
            if (i==2){
                tmpSt.push(fromSt.pop());
                toSt.push(fromSt.pop());
                toSt.push(tmpSt.pop());
            }
            else {
                toSt.push(fromSt.pop());
                tmpSt.push(fromSt.pop());
                tmpSt.push(toSt.pop());
                toSt.push(fromSt.pop());
            }
        }
    }
}
