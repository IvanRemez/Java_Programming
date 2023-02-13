package day39_Collections.MultiThreading;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
            // List accepts duplicates, keeps insertion order, has index #s

        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list);

        System.out.println("---------------------------------------");

        Set<Integer> set1 = new HashSet<>(); // order is random, accepts null

        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(null, null, null, null, null));
        // ^^ accepts null but only ONE will be added because duplicates aren't allowed

        System.out.println(set1);
        System.out.println("---------------------------------------");

        Set<Integer> set2 = new LinkedHashSet<>();  // keeps insertion order, accepts null

        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(null, null, null, null, null));

        System.out.println(set2);

        Set<Integer> set3 = new TreeSet<>(); // keeps sorted order, removes duplicates

        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        // set3.addAll(Arrays.asList(null, null, null, null, null));
        // null NOT accepted - needs to call value of each element to sort them

        System.out.println(set3);   // SORTED
        System.out.println("---------------------------------------");

        String[] words = {"Java", "Java", "Java", "Python", "C#", "C++", "Ruby", "Python", "C#"};

        Set<String> result = new LinkedHashSet<>();

        result.addAll(List.of(words));

        System.out.println(result);

        // System.out.println(result.get(1));
/*
        for (String each : result) {
            System.out.println(each);
        }
 */

        System.out.println(new ArrayList<>(result).get(1));

// convert back to Array:

        words = result.toArray(new String[0]);  // Covert Set to Array
        // giving 0 for size creates new array to fit the specified elements

        System.out.println("Words Array : " + Arrays.toString(words));

        System.out.println("---------------------------------------");

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 20, 20, 30, 40, 40, 50, 50, 50));

        System.out.println(new TreeSet<>(numbers)); // convert List to Set
        // elements added to TreeSet which removes duplicates and sorts in ascending order
    }
}
