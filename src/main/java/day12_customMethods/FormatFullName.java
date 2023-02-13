package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String first = input.nextLine().trim().replace(" ", "");
            // can add .trim() to avoid white spaces that user might enter

        System.out.println("Enter your last name:");
        String last = input.nextLine().trim().replace(" ", "");
            // can also add /replace() to remove white spaces between chars ^^

        first = first.substring(0, 1).toUpperCase() + first.substring(1).toLowerCase();
            // 1st character of first name "c" --> "C"
            // the rest of characters of the first name         "yDEo" --> "ydeo"
        last = last.substring(0, 1).toUpperCase() + last.substring(1).toLowerCase();
                            // "S" --> "S"                  / "CHOOL" --> "chool"

        System.out.println(first + " " + last);


    }
}
/*
1. Write a program that asks user to enter first and last names, and then prints
the full name in regular format (first character in upper case)
	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";
	                    output:
	                        Cydeo School
 */