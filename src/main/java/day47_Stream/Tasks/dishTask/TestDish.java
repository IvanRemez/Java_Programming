package day47_Stream.Tasks.dishTask;

import java.util.Comparator;
import java.util.stream.Stream;

public class TestDish {

    public static void main(String[] args) {


// Print all dish’s name that has less than 400 calories:

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
//                .map(dish -> dish.getName())
                .map(Dish::getName)
                .forEach(System.out::println);
        System.out.println("----------------------------------------");

// Print the length of the name of each dish:

        DishData.getAll().stream()
                .map(dish -> dish.getName().length())
                .forEach(System.out::println);
        System.out.println("----------------------------------------");

// Print 3 high caloric dish name ( >300 cals)

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);
        System.out.println("----------------------------------------");

// Print all dish’s name that has less than 400 calories (sort by calories):

    /* Before:
        Stream<Dish> dish = DishData.getAll().stream();
        dish.filter()

    After:
     */

        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);

        Stream<Dish> dishStream = DishData.getAll().stream();

//        dishStream.
//        can use any Intermediate Operations on this Stream instance


    }
}
