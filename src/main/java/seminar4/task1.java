package seminar4;

import java.util.ArrayDeque;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        while (true) {
            String text = inputText();
            if (text.equalsIgnoreCase("print")) {
                for (String s: arrayDeque) {
                    System.out.println(s);
                }
            } else if (text.equalsIgnoreCase("revert")) {
                arrayDeque.removeFirst();
                
            } else if (text.equalsIgnoreCase("exit")) {
                break;
            } else {
                arrayDeque.addFirst(text);
            }
        }
    }
    private static String inputText() {
        String text = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input data: ");
        try {
            text = scanner.nextLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return text;
    }
}
