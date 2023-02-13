package day44_Lambda.AppleFarmer;

@FunctionalInterface
public interface ApplePredicate {

    boolean test(Apple apple);
}
