package day27_accessModifiers;

public class TestNestedClassObjects {

    public static void main(String[] args) {

        Car obj1 = new Car(); // Car object

        obj1.new CarEngine(); // Inner Class - CarEngine object

        new Car.StaticInnerClass();
        // Inner (Nested) Class can be called through it's outer Class name

    }
}
