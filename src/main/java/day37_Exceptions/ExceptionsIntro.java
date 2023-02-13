package day37_Exceptions;

import java.io.FileInputStream;

public class ExceptionsIntro {

    public static void main(String[] args) {

        String str = "Java";

        //char ch = str.charAt(250); // Unchecked Exception - occurs during Runtime
        //System.out.println(ch);

        Pizza pizza = null; // null is NOT an object
                            // therefore object method CANNOT execute
        // pizza.calcCost(); // Unchecked Exception
                            // = NullPointerException

        // System.out.println(50/0); // Unchecked Exc. - ArithmeticException

        System.out.println("Hello World");
        System.out.println("--------------------------------------------");

        int score = 100;

        if (score > 59){ // bug - ALL scores above 59 will print "grade is D"
            System.out.println("Your grade is D");
        } else if (score > 70) { // will not execute if score is above 59
            System.out.println("Your grade is C");
        }
        System.out.println("--------------------------------------------");

//      FileInputStream file = new FileInputStream(""); // Checked Exception

//      Thread.sleep(3000); // Checked Exc.


    }
}
