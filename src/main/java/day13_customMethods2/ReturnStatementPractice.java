package day13_customMethods2;

import java.util.Scanner;

public class ReturnStatementPractice {

    public static void main(String[] args) {

        System.out.println("Enter your grade: ");

        char grade = new Scanner(System.in).next().charAt(0);

        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' ||
                grade == 'D' || grade == 'F';

        if (!isValid) {      // if the grade is NOT valid
            System.err.println("Invalid Grade");
            return;     // terminates the program
        }

        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            default:
                System.out.println("Failed");

        }

    }
}
