package day09_scanner;

import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();
        // Scanner reads everything: Aaron King Daniel + Enter

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();
        // Cydeo School + Enter (nothing left in scanner)

        System.out.println("Enter your gender: ");
        String gender = input.next(); // Male + Enter
        // Scanner will only read Male and the rest goes into memory

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 28 + Enter

        input.nextLine(); // this clears the Scanner memory
        // need to provide extra nextLine method if using another method prior to

        System.out.println("Enter your street name");
        String street = input.nextLine();

        System.out.println(fullName);
        System.out.println(schoolName);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(street);


        input.close();
    }
}
