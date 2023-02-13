package day27_accessModifiers;

public class Car { // Outer Class

    public String make, model, color;
    public int year;
    public double price;

    public static int wheels = 4;

    public class CarEngine{ // Inner Class - Non-Static

        public void method(){
            System.out.println(make); // can accept Non-Static
            System.out.println(wheels); // AND Static members
        }
    }

    public static class StaticInnerClass{ // Inner Class - Static
        // Only accepts Static members

        public void method(){
            // System.out.println(make); // cannot accept Non-Static
            System.out.println(wheels);
        }
    }


}
