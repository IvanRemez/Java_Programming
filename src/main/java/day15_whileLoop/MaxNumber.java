package day15_whileLoop;

import java.util.Scanner;

public class MaxNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max = -2147483648;  // default condition (any # entered will be larger)

            // 1st loop (num = 10) -> max = 10

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = input.nextInt();  // 10, 5, 3, 20, 15 -> max = 20

            if (num > max) {    // if user entry is greater than the current max
                max = num;      // then entry replaces the current max
            }
        }

        System.out.println("max = " + max);     // max = 20

        input.close();

    }
}
// task 1:
// write a program that can ask a user to enter a number 5 times
// print the maximum number