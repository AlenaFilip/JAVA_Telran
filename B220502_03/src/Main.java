public class Main {

    public static void main(String[] args) {
        String str1 = "ab";
        String str2 = "qwer";
        String str ="";
        int maxLength = 0;
        if (str1.length() > str2.length()) {
            maxLength = str1.length();
        } else {
            maxLength = str2.length();
        }
        for (int i = 0; i < maxLength; i++) {
            if(str1.length()>i){
                str=str+str1.charAt(i);
            }
            if(str2.length()>i){
                str=str+str2.charAt(i);
            }
        }
        System.out.println(str);
    }
}
