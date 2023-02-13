package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityMethods {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        System.out.println(names);

        /*
        for (int i = 0; i < names.size(); i++) {

            if (names.get(i).equalsIgnoreCase("Java")){
                names.set(i, "Python");     // still works but requires more steps
            }
        }                               // can be used if case sensitivity is an issue
        System.out.println(names);
         */

        // replaceAll() Collections method - no loop needed
        Collections.replaceAll(names, "Java", "Python"); // ** case sensitive ^^use if needed

        System.out.println(names);
        System.out.println("-------------------------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));

        int count = Collections.frequency(list, 50);

        System.out.println("Frequency of 50: " + count);
        System.out.println("-------------------------------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Java", "C#", "C#", "Ruby", "Swift", "Swift", "Java"));

        int countJava = Collections.frequency(words, "Java");

        System.out.println("countJava = " + countJava);
        System.out.println("-------------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 20, 20, 30, 40, 40, 50, 50, 50, 50, 50, 60, 60, 50, 50, 50));

        for (Integer each : numbers) {

            if (Collections.frequency(numbers, each) == 1){ // if frequency of element is 1, it is unique

                System.out.println(each);
            }
        }


    }
}
