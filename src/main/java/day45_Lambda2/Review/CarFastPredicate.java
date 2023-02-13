package day45_Lambda2.Review;

public class CarFastPredicate implements CarPredicate{

    @Override
    public boolean test(Car car) {
        return car.getTopSpeed() > 160;
    }
}
