package day09_scanner;

import java.util.Scanner;

public class Eligible {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = input.nextInt();

        if (age >= 21){
            System.out.println("You are eligible");
        }else {
            System.out.println("You are NOT eligible");
        }

        input.close();
    }
}
