package seminar5;

import java.util.HashMap;
import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        createPhoneBook();
    }
    private static void createPhoneBook() {
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("8 927 015-82-47", "Belov Alexey Ivanovich");
        phoneBook.put("8 927 075-82-07", "Nikolaev Ivan Vladimirovich");
        phoneBook.put("8 525 375-22-37", "Sedov Ivan Vladimirovich");
        phoneBook.put("8 917 315-02-46", "Belov Alexey Ivanovich");
        phoneBook.put("8 907 055-82-03", "Egorov Oleg Alexeevich");
        phoneBook.put("8 595 175-92-31", "Nikiforov Maxim Anatolevich");
        phoneBook.put("8 325 375-29-37", "Emelin Stepan Igorevich");
        phoneBook.put("8 917 715-01-76", "Belov Alexey Ivanovich");
        phoneBook.put("8 986 057-82-03", "Egorova Elena Maximovna");
        phoneBook.put("8 505 185-98-31", "Malina Anna Vadimovna");
        phoneBook.put("8 920 015-92-02", "Nikolaev Ivan Vladimirovich");

        Scanner in = new Scanner(System.in);
        System.out.print("Input the name, please: ");
        String name = in.nextLine();

        for (String key : phoneBook.keySet()) {
            if (name.equals(phoneBook.get(key))) {
                System.out.printf("%s, phone number: %s\n", phoneBook.get(key), key);
            }
        }

        System.out.print("Input the phone number, please: ");
        String number = in.nextLine();
        in.close();
        System.out.printf("%s, phone number: %s\n", phoneBook.get(number), number);
    }
}
