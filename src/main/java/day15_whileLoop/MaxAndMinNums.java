package day15_whileLoop;

import java.util.Scanner;

public class MaxAndMinNums {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int min = 2147483647;
        int max = -2147483648;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = input.nextInt();

            if (num > max) {    // if user entry is greater than the current max
                max = num;      // then entry replaces the current max
            }

            if (num < min) {    // if user entry is smaller than the current min
                min = num;      // then entry replaces the current min
            }

        }

        System.out.println("max number = " + max);
        System.out.println("min number = " + min);
    }
}
