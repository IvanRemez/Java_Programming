package day04_concatenation;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(100 + 200); // addition = 300
        System.out.println(40 - 10); // subtraction = 30

        System.out.println("100" + 200); // concatenation = 100200
        System.out.println("--------------------------------------");
        System.out.println(50 / 6); // int / int = int
        System.out.println(50 / 6.0); // int / double = double
        System.out.println(50.0 / 6); // double / int = double
        System.out.println(50d / 6);
                // int specified as double = double
        System.out.println("-------------------------------------");

        System.out.println( (int) (2.5 / 0.5)); // = int
        System.out.println(2.5 / 0.5); // = double

        System.out.println(10 * 2);
        System.out.println(20 * 12);
        System.out.println("-------------------------------------");

        System.out.println(10 % 3); // Modulus (%) - Remainder
        System.out.println(20 % 6);
        System.out.println(15 % 4);

    }
}
