package day15_whileLoop;

import java.util.Scanner;

public class MinNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2147483647;  // default condition (any # entered will be smaller)

            // 1st loop (num = 10) -> min = 10

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = input.nextInt();  // 10, 5, 3, 20, 15 -> min = 3

            if (num < min) {    // if user entry is smaller than the current min
                min = num;      // then entry replaces the current min
            }
        }

        System.out.println("min = " + min); // min = 3

        input.close();
    }
}
// task 2:
// write a program that can ask a user to enter a number 5 times
// print the minimum number