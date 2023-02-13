package day46_Comparator_Interface;

import day44_Lambda.AppleFarmer.Apple;
import day44_Lambda.AppleFarmer.Color;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<Apple>();

        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));
/// Comparator.comparing imported so no need to call Class Name:
        Comparator<Apple> sortApple = Comparator.comparing((Apple apple) -> apple.getWeight());
        inventory.sort(sortApple);
        System.out.println(inventory);

        inventory.sort(comparing(Apple :: getWeight));
        System.out.println(inventory);

    // Reversed default method:
        inventory.sort(comparing(Apple :: getWeight).reversed());
        System.out.println(inventory);

    // Chaining Comparators:
        inventory.sort(comparing(Apple :: getWeight)
                .reversed()
                .thenComparing(Apple :: getColor));
    }
}
