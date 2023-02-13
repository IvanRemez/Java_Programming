package day04_concatenation;

public class ConcatenationIntro {

    public static void main(String[] args) {

        String name = "Daniel";
        int age = 35,
                salary = 85_000;
        // can add _ to make larger numbers readable

        System.out.println("Hello " + name + ".");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your salary is " + salary + " USD");

        int number = 100_000_000;
        System.out.println("number = " + number);

    }
}
