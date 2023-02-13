package day37_Exceptions;

import day36_Polymorphism2.Circle;

public class TestPizzaObject {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S',2,3);

        Pizza pizza2 = new Pizza('S',2,3);

        System.out.println(pizza1 == pizza2); // diff objects = false

        System.out.println(pizza1.equals(pizza2)); // diff objects but same values = true

        Object obj = (Object) new Pizza('S',4,3);
                    // ^^ Upcasting - implicit

        // obj.calcCost(); Cannot call because method is NOT in Reference type (Object)

        boolean r = obj.equals(pizza2); // equals method IS in Object so can call

            // b/c obj is new Pizza - this will determine which implementation of equals method will execute
            // Overridden equals() executes
            // obj size and # of pepperoniTopping is same as pizza2 so = true

        System.out.println(r);

        double total = ((Pizza)obj).calcCost();

        System.out.println(total);

        // double area = ((Circle)obj).area();
            // MUST have "IS A" relationship to cast
            // ClassCastException revealed during RunTime

        System.out.println("Builder Completed");
        // will NOT print after the ClassCastException which terminates with exit code 1
    }
}
