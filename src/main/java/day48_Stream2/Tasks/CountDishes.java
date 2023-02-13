package day48_Stream2.Tasks;

import day47_Stream.Tasks.dishTask.DishData;

public class CountDishes {

    public static void main(String[] args) {

        Integer sumDishes = DishData.getAll().stream()
                .map(dish -> 1)
                .reduce(0, Integer::sum);
        System.out.println(sumDishes);
    }
}
