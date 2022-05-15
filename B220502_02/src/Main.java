public class Main {

    public static void main(String[] args) {
	    String str="It’s new task for me";
        int amount = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' ') amount++;
        }
        System.out.println(amount);
    }
}
