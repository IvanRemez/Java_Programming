package day45_Lambda2;

import day44_Lambda.AppleFarmer.Apple;
import day44_Lambda.AppleFarmer.ApplePredicate;

import java.util.function.*;

public class FunctionalInterface {

    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() {  // ANONYMOUS CLASS
            @Override           // automatically overrides the method
            public boolean test(Apple apple) {
                return apple.getWeight() > 200;
            }
        };

//          PREDICATE:

        Predicate<Integer> lesserThan = i -> i < 18;
        System.out.println(lesserThan.test(20));    // FALSE
        //                      ^^ calling method using Predicate Interface

        System.out.println("-------------------------------------------");

//          CONSUMER:           // accepts Object, returns void

        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(10);
        System.out.println("-------------------------------------------");

//          BI-CONSUMER:        // accepts 2 Objects, returns void

        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(1, 2);
        System.out.println("-------------------------------------------");

//          FUNCTION:           // accepts Object, returns Object

        Function<String, String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Cydeo"));
        System.out.println("-------------------------------------------");

//          BI-FUNCTION:           // accepts 2 Objects, returns Object

        BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
        System.out.println(func.apply(2, 3));
        System.out.println("-------------------------------------------");

//          BI-FUNCTION:           // accepts NO Parameters, returns result

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());
    }
}
