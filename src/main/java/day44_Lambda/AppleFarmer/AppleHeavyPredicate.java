package day44_Lambda.AppleFarmer;

public class AppleHeavyPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 200;
    }
}
