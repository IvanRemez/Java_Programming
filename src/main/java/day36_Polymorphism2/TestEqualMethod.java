package day36_Polymorphism2;

public class TestEqualMethod {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle(5);

        Circle circle3 = new Circle(15);

        System.out.println(circle1 == circle2); // false - 2 different objects

        System.out.println(circle1.equals(circle2)); // true - both have radius of 5
                                // ^^ uses OVERRIDDEN equals() method created in Circle class

        System.out.println(circle1.equals(circle3)); // false - different radius

        System.out.println("--------------------------------------------------");

        IPhone iphone1 = new IPhone("Orange", "Iphone 12", "Medium", "Black", 900);

        IPhone iphone2 = new IPhone("Orange", "Iphone 12", "Medium", "White", 900);


        System.out.println( iphone1.equals(iphone2) );    }
}
