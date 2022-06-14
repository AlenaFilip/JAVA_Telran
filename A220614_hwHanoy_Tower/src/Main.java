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
