package day15_whileLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your 1st number:");
        double n1 = input.nextDouble();
        System.out.println("Enter your 2nd number:");
        double n2 = input.nextDouble();
        System.out.println("Enter a math operator:");
        char operator = input.next().charAt(0);

        while ( !(operator == '+' || operator == '-' || operator == '*'
                || operator == '/')){
            // while operator is invalid, loop repeats

            System.err.println("Invalid Operator! Please re-enter your operator");
            operator = input.next().charAt(0);
        }

        if (operator == '+'){
            System.out.println(n1 + n2);
        } else if (operator == '-') {
            System.out.println(n1 - n2);
        } else if (operator == '*') {
            System.out.println(n1 * n2);
        }else {     // division block
            System.out.println(n1 / n2);
        }
    }
}
