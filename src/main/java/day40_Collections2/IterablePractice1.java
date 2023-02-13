package day40_Collections2;

import java.util.*;

public class IterablePractice1 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10));

        Iterator<Integer> iterator = list.iterator();

        System.out.println(iterator.hasNext()); // iterates list checking for next element
        System.out.println(iterator.next());    // retrieves next element = 10

        System.out.println("---------------------------------------------------");

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        Iterator<String> it = names.iterator();

        while (it.hasNext()){   // iterating each element

            String each = it.next();    // checking each element
            if (each.equalsIgnoreCase("ahmed")){
                it.remove();    // if element is "ahmed", remove using iterator remove() method
            }
        }

        // names.removeIf(p -> p.equalsIgnoreCase("ahmed"));

        System.out.println(names);
        System.out.println("---------------------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        names2.removeIf(p -> p.equalsIgnoreCase("ahmed"));

        System.out.println(names2);
        System.out.println("---------------------------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));

        // find the Nth largest number

        int n = 5;

        for (int i = 0; i < n - 1; i++) {

            numbers.removeIf(p -> Collections.max(numbers) == p);
            // if number == max number, remove it
        }

        int max = Collections.max(numbers);

        System.out.println(max); // 5th largest number
    }
}
