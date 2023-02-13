package day48_Stream2;

import day47_Stream.Tasks.dishTask.Dish;
import day47_Stream.Tasks.dishTask.DishData;
import day47_Stream.Tasks.dishTask.Type;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(3, 4, 5, 6, 6, 7);

// toCollection(Supplier)
        // used to create a Collection using Collector

        List<Integer> numList = nums.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(numList);

        Set<Integer> numSet = nums.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toCollection(HashSet::new));

        System.out.println(numSet);     // Set eliminates duplicates*

// toList()
    // returns a Collector interface that gathers input data into a new List

        List<Integer> numList2 = nums.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

// toSet()
   // returns a Collector interface that gathers input data into a new Set

        Set<Integer> numSet2 = nums.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());

// toMap(Function, Function)
    // returns a Collector interface that gathers input data into a new Map

        Map<String, Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));

        System.out.println(dishMap);

// summingInt(ToIntFunction)
    // returns a Collector that produces the sum of an Integer-valued function

        Integer sum = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));

        System.out.println(sum);

// counting()
    // returns a Collector that counts the # of the elements

        Long evenCount = nums.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.counting());

        System.out.println(evenCount);

// averagingInt(ToIntFunction)
    // returns the average of the integers passed values

        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));

        System.out.println(calorieAverage);

// joining()    (concatenation)
    // used to join various elements of a char or string array into a single object

        List<String> courses = Arrays.asList("Java", "JS", "TS");
        String str = courses.stream()
                .collect(Collectors.joining(", "));

        System.out.println(str);

// partitioningBy()
    // used to partition a stream of objects (or a set of elements)
    // based on a given predicate

        // partitioning by IS VEGETARIAN boolean:
        Map<Boolean, List<Dish>> veggieDish = DishData.getAll().stream()
        //  ^^ Key,   ^^ Values: list of dishes
                .collect(Collectors.partitioningBy(Dish::isVegetarian));

        // return partitioningBy(predicate, toList())

        System.out.println(veggieDish);

// groupingBy()
    // used for grouping objects by some property and storing results in a
    // Map instance

        // grouping by DISH TYPE:
        Map<Type, List<Dish>> dishType = DishData.getAll().stream()
        //  ^^ Key,   ^^ Values: list of dishes
                .collect(Collectors.groupingBy(Dish::getType));

        // return groupingBy(classifier, toList())

        System.out.println(dishType);
    }
}
