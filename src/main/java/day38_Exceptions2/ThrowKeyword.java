package day38_Exceptions2;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) {

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();

        if (age < 0) {
            throw new InputMismatchException("Age cannot be negative");
        } else if (age > 150) {
            throw new InputMismatchException("Age cannot be greater than 150");
        }

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("NOT Eligible");
        }
        System.out.println("--------------------------------------------------");

    //    throw new RuntimeException("Runtime Exception");
    //    System.out.println("Hello World");

        try {
            throw new FileNotFoundException("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------------------");

        RuntimeException exception = new RuntimeException();
        //              ^^
        // throw exception; // variable used when we plan to use object more than once
        //  OR
        // throw new RuntimeException();

        // throw new Person("Jimmy",45,'M');
        // throw AND Throws only applicable to objects that have
        // "IS A" relationship with Throwable Exceptions

    }
}
