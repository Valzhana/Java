package seminar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class task1 {
    public static void main(String[] args) {
        getNumberByName(createPhoneBook());
        getNameByNumber(createPhoneBook());
    }
    private static HashMap createPhoneBook() {
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
        return phoneBook;
    }
    private static void getNumberByName(Map<String, String> phoneBook) {
        Scanner in = new Scanner(System.in);
        String name = "";
        do {
            System.out.print("Input the name, please: ");
            try {
                name = in.nextLine();
            } catch (Exception e) {
                System.out.println("Error");
                e.printStackTrace();
            }
            for (String key : phoneBook.keySet()) {
                if (name.equals(phoneBook.get(key))) {
                    System.out.printf("%s, phone number: %s\n", phoneBook.get(key), key);
                }
            }
        }
        while (phoneBook.containsValue(name));
        System.out.println("There is no such contact in the phonebook!");
    }
    private static void getNameByNumber(Map<String, String> phoneBook) {
        Scanner in = new Scanner(System.in);
        String number = "";
        do {
            System.out.print("Input the number, please: ");
            try {
                number = in.nextLine();
            } catch (Exception e) {
                System.out.println("Error");
                e.printStackTrace();
            }
            for (String key : phoneBook.keySet()) {
                if (phoneBook.get(key).equals(phoneBook.get(number))){
                    System.out.printf("%s, phone number: %s\n", phoneBook.get(key), key);
                }
            }
        }
        while (phoneBook.containsKey(number));
        System.out.println("There is no such contact in the phonebook!");
        in.close();
    }
}
