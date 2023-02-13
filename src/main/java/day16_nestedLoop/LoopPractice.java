package day16_nestedLoop;

import java.util.Scanner;

public class LoopPractice {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {

            System.out.println("Hello " + i);
        }

        // System.out.println(i); // i only accessible within the for loop

        System.out.println("--------------------------------------");

        for (int i = 0; i < 5; i++) {

            System.out.println("Hello " + i);
        }
        System.out.println("--------------------------------------");

        int j = 0;

        while (j < 5){
            System.out.println("Hello " + j);
            j++;    // loop will repeat until j reaches 4
        }
        System.out.println("--------------------------------------");

        int k = 0;
        do {
            System.out.println("Hello " + k);
            k++;
        }while (k < 5);
        // can also be used with limited repetitions but NOT good practice
        System.out.println("--------------------------------------");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score:");
        int score = input.nextInt();

        while (score > 100 || score < 0){   // condition to check score validity
            // while score is INVALID
            System.out.println("Invalid score, please re-enter your score:");
            score = input.nextInt();
        }

        if (score >= 60){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }


    }
}
