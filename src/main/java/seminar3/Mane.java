package seminar3;

import java.util.*;

public class Mane {
    public static void main(String[] args) {
        removeEvenNumbersFromList();
        getMinMaxAverageValues();
        removeDuplicates();

    }

    private static void removeEvenNumbersFromList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(1, 11));
        }
        System.out.println(arrayList);
        arrayList.removeIf(num -> num % 2 == 0);
        System.out.println(arrayList);
    }




    private static void getMinMaxAverageValues() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            arrayList.add(random.nextInt(1, 12));
        }
        System.out.println(arrayList);
        int minValue = arrayList.get(0);
        int maxValue = arrayList.get(0);
        double sum = 0;

        for (Integer i: arrayList) {
            if (i < minValue) {
                minValue = i;
            } else if (i > maxValue) {
                maxValue = i;
            }
            sum += i;
        }
        double averageValue = sum / arrayList.size();

        System.out.println("minimum = " + minValue + ", " + "maximum = " + maxValue + ", "
                + "average = " + averageValue);
    }




    private static void removeDuplicates() {
        ArrayList <String> planets = new ArrayList<>();
        HashMap<String, Integer> planetCount = new HashMap<>();
        Random random = new Random();

        String[] solarSystemPlanets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        for (int i = 0; i < 10; i++) {
            int randomIndex = random.nextInt(solarSystemPlanets.length);
            planets.add(solarSystemPlanets[randomIndex]);
        }
        for (String planet: planets) {
            if (planetCount.containsKey(planet)) {
                planetCount.put(planet, planetCount.get(planet) + 1);
            } else {
                planetCount.put(planet, 1);
            }
        }
        for (String planet: planetCount.keySet()) {
            System.out.printf("%s\t%s%n", planet, planetCount.get(planet));
        }

        Set<String> set = new LinkedHashSet<>(planets);
        List<String> listWithoutDuplicates = new ArrayList<>(set);
        System.out.println(listWithoutDuplicates);
    }
}
