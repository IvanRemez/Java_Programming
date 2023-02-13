package day48_Stream2;

import day47_Stream.Tasks.dishTask.Dish;
import day47_Stream.Tasks.dishTask.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {

// ALL Match:

        boolean isHealthy = DishData.getAll().stream()
                .allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);      // true

 // ANY Match:

        if (DishData.getAll().stream()
                .anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly ");
        }

// NONE Match:

        boolean isHealthy2 = DishData.getAll().stream()
                .noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println(isHealthy2);     // true

// FIND ANY:

        Optional<Dish> dish = DishData.getAll().stream()
                .filter(Dish::isVegetarian).findAny();
        System.out.println(dish.get().getName());   // fries
        System.out.println("------------findFirst---------------------------");

// Find FIRST:

        Optional<Dish> dish2 = DishData.getAll().stream()
                .filter(Dish::isVegetarian).findFirst();
        System.out.println(dish2.get());        // fries
        System.out.println("------------------------------------------------");

// Parallel Streams (Asynchronized):

        System.out.println(IntStream.range(0,100).parallel().findAny());
        // findAny() with parallel finds random int b/w 0 and 100
        // OptionalInt[65] - 65 loaded first

        System.out.println(IntStream.range(0,100).parallel().findFirst());
        // OptionalInt[0] - findFirst() is synchronized in this case

        // parallel is Asynchronized so it does not wait for entire DataBase
        // to load before outputting result
        System.out.println("--------------Parallel Streams-------------------");

        List<String> list1 = Arrays.asList("Jonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");
    //    List<String> list2 = Arrays.asList("Jonny","David","Jack","Duke","Jill","Dany","Julia","Jenish","Divya");

        Optional<String> findFirst = list1.parallelStream().filter(s -> s.startsWith("D")).findFirst();
    //    Optional<String> findAny = list2.parallelStream().filter(s -> s.startsWith("J")).findAny();
        Optional<String> findAny = list1.parallelStream().filter(s -> s.startsWith("D")).findAny();

        System.out.println(findFirst.get()); // David - findFirst() gets 1st element in order
        System.out.println(findAny.get()); // Dany - findAny() gets random element (1st to load)
        System.out.println("-------------Max and Min------------------------");

// Min and Max:

        Optional<Dish> dMin = DishData.getAll().stream()
//                .sorted().findFirst()
                .min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin.get());

        Optional<Dish> dMax = DishData.getAll().stream()
                .max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax.get());

    }

}
