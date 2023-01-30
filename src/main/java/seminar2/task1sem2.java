package seminar2;

public class task1sem2 {
    public static void main(String[] args) {
        isTheStringPalindrome("racecar");
    }
    private static void isTheStringPalindrome(String str) {
        int length = str.length();
        Boolean result = null;
        for (int i = 0; i < (length/2); i++) {
            result = (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(length - i - 1));

        }
        System.out.println(result);
    }
}
