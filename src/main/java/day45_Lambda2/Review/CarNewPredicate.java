package day45_Lambda2.Review;

public class CarNewPredicate implements CarPredicate{

    @Override
    public boolean test(Car car) {
        return car.getYear() > 2015;
    }
}
