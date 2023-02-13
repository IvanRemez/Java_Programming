package day48_Stream2;

import day47_Stream.Tasks.dishTask.Dish;
import day47_Stream.Tasks.dishTask.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(4,5,3,9);
/*
        int sum = 0;
        for (Integer number : numbers) {
            sum = sum + number;
        }
 */

// Initial value 0:
        int result = numbers.stream()
                .reduce(0, (a,b) -> a + b);
        System.out.println(result);

// NO Initial Value:
        Optional<Integer> result2 = numbers.stream()
                .reduce((a,b) -> a + b);
    // returns Optional*
        System.out.println(result2);

// Dish calories Total:
        int calTotal = DishData.getAll().stream()
                .map(Dish::getCalories)
//                .reduce((a,b) -> a+b)
                .reduce(Integer::sum)
                .get();                 // gets rid of Optional
        System.out.println(calTotal);

// Max and Min:
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);

        System.out.println("min = " + min.get());
        System.out.println("max = " + max.get());
        System.out.println("sum = " + sum.get());

// Count:

        long dishCount = DishData.getAll().stream()
                .count();
        System.out.println(dishCount);

    }
}
