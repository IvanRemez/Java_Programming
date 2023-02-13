package day16_nestedLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";

        // outer loop - if user wants to continue using the calculator
        while (answer.equals("yes")){

            System.out.println("Enter a number:"); // 1st # input
            double n1 = input.nextDouble();

            System.out.println("Enter a math operator: (+, -, *, /)");
            char o = input.next().charAt(0);    // operator input

            while (!(o == '+' || o == '-' || o == '*' || o == '/')){
                // while operator is INVALID
                System.err.println("Invalid Operator! Please re-enter a math operator: (+, -, *, /)");
                o = input.next().charAt(0);
            }

            System.out.println("Enter a second number:"); // 2nd # input
            double n2 = input.nextDouble();

            double result = (o == '+') ? n1 + n2 : (o == '-') ? n1 - n2 :(o == '*')?
                    n1 * n2 : n1 /n2;
            System.out.println("result = " + result); // calculation result

            System.out.println("Would you like to continue? Yes/No");
            answer = input.next().toLowerCase();    // outer loop iterator

            // nested loop to check outer loop iterator validity
            while (!(answer.equals("yes") || answer.equals("no"))){
                // while answer is INVALID
                System.err.println("Invalid Entry! Would you like to enter another number? Yes/No");
                answer = input.next().toLowerCase();
            }
            // ^^ need to add this nested loop to avoid any answer other than "yes" or "no"
            }
        }

    }

/*
1. Write a program for a simple calculator
    1.1 Ask the user to enter a number (double)
    1.2 Ask the user to enter a math operator (+, -, *, /)
        If user enters an Invalid operator, repeat until user enters a valid operator

    1.3 Ask user to enter a second number (double)
    1.4 Display the calculation result
    1.5 Ask user: "Would you like to continue? Yes/No"
 */