package day15_whileLoop;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt(); // valid age = 1 - 120

        while (!(age >= 1 && age <= 120)) { // While the age is NOT valid

            System.err.println("Invalid entry! Please re-enter your age:");
            age = input.nextInt();
        }

        System.out.println("Are you a US citizen? Yes/No");
        String yesOrNo = input.next();

        while (!(yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("no"))){
            // while the answer is invalid, loop repeats

            System.err.println("Invalid entry! Please re-enter:");
            System.out.println("Are you a US citizen? Yes/No");
            yesOrNo = input.next().toLowerCase();
        }

        if (age >= 21 && yesOrNo.equalsIgnoreCase("yes")){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are NOT eligible to vote");
        }

        input.close();
    }
}
