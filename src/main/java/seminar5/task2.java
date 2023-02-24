package seminar5;

import java.util.*;
import java.util.stream.Collectors;

public class task2 {
    public static void main(String[] args) {
        System.out.println(sortNamesByPopularity(countFirstNameDuplicates(createListOfEmployees())));
    }
    private static HashMap createListOfEmployees() {

        HashMap<String, String> employees = new HashMap<>();
        employees.put("Иванов", "Иван");
        employees.put("Петрова", "Светлана");
        employees.put("Белова", "Кристина");
        employees.put("Мусина", "Анна");
        employees.put("Крутова", "Анна");
        employees.put("Юрин", "Иван");
        employees.put("Лыков", "Петр");
        employees.put("Чернов", "Павел");
        employees.put("Чернышов", "Петр");
        employees.put("Федорова", "Мария");
        employees.put("Светлова", "Марина");
        employees.put("Савина", "Мария");
        employees.put("Рыкова", "Мария");
        employees.put("Лугова", "Марина");
        employees.put("Владимирова", "Анна");
        employees.put("Мечников", "Иван");
        employees.put("Петин", "Петр");
        employees.put("Ежов", "Иван");
        return employees;
    }
    private static HashMap countFirstNameDuplicates(Map<String, Integer> employees) {
        HashMap<String, Integer> firstNames = new HashMap();
        for (String key : employees.keySet()) {
            System.out.printf("%s %s\n", employees.get(key), key);
            if (firstNames.containsKey(employees.get(key))) {
                firstNames.put(String.valueOf(employees.get(key)), Integer.parseInt(firstNames.get(employees.get(key)).toString()) + 1);
            } else {
                firstNames.put(String.valueOf(employees.get(key)), 1);
            }
        }
        return firstNames;
    }
    private static Map sortNamesByPopularity(Map <String, Integer> firstNames) {
        Map<String, Integer> result = firstNames.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        return result;
    }
}
