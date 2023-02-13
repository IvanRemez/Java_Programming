package day27_accessModifiers;

public class TestCircleObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(7);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        //System.out.println(circle1.pi);
            // ^^ can print but not best practice
        // Static variables (like Pi) should be accessed through Class NOT Object

        System.out.println(Circle.pi);


    }
}
