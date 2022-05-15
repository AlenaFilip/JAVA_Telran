public class Main {

    public static void main(String[] args) {
        String str = "It’s new task for me";
        char myChar = 'e';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==myChar) System.out.print(myChar);
        }
    }
}
