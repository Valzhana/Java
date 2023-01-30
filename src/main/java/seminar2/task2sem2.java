package seminar2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class task2sem2 {
    public static void main(String[] args) {
        makeStringOfRepetitions("TEST");
    }

    private static void makeStringOfRepetitions(String str) {
        StringBuilder builder = new StringBuilder(100);
        for (int i = 0; i <= 100; i++) {
            builder.append(str);
        }
        try (PrintWriter pw = new PrintWriter("src/main/resources/task2sem2.txt")) {
            pw.print(builder);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
