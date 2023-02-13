package day14_forLoop;

import java.util.Scanner;

public class ForLoopPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number: ");
            sum += input.nextInt();
            
        }

        System.out.println("sum = " + sum);
        System.out.println("-----------------------------------");

        // task 1:
        // write a program that can ask a user to enter a number 5 times
        // print the maximum number
        // task 2:
        // same but print min number

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter a number: ");
            int num = input.nextInt();
        }


        
    }
}
