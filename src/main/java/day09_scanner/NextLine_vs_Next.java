package day09_scanner;

import java.util.Scanner;

public class NextLine_vs_Next {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 45 + Enter (key)

        input.nextLine(); // this line removes Enter from Scanner memory

        // Enter key stays in Scanner memory after the last digit is typed (5)
        // This triggers the following nextLine method

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();
            // when you hit Enter after first input, this code is triggered as well

        System.out.println("Age = " + age);
        System.out.println("Full name = " + fullName);

        input.close();
    }
}
