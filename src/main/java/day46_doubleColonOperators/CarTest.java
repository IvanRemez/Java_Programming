package day46_doubleColonOperators;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {

    public static void main(String[] args) {

    // Zero (0) Arg Constructor:

        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
// Compiler already ^^ knows it's a car so no need for Car() after new
        System.out.println(c2.get().getMake());

    // 1 Arg Constructor:

        Function<Integer, Car> f1 = model -> new Car(model);
        Function<Integer, Car> f2 = Car :: new;
// While method is called with methodName, Constructor is called with new

    // 2 Arg Constructor:

        BiFunction<String, Integer, Car> a1 = Car :: new;
        Car honda = a1.apply("Honda",2015);
        System.out.println(honda.getMake() + " " + honda.getModel());
    }
}
