package day44_Lambda.AppleFarmer;

import day44_Lambda.Sorting;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();

        inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));

    // create new heavy apple object variable -> pass in the filter parameter:
        AppleHeavyPredicate abc = new AppleHeavyPredicate();

        List<Apple> heavyApple = filterApples(inventory, abc);
        System.out.println(heavyApple);

 // OR
    // pass new apple object directly in the filter parameter:
        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
        System.out.println(greenApple);

    // Lambda allows us to use a function (method)
    // without creating another class for it:
        ApplePredicate weightApple = (Apple apple) -> apple.getWeight() > 200;

    // Static method accepting our list and then our Lambda function:
        filterApples(inventory, weightApple);
    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate applePredicate){

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (applePredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
