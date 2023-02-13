package day09_scanner;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");

        int num = input.nextInt();

        if (num >= 0){
            if (num % 2 == 0){
                System.out.println("This is an even number");
            } else if (num % 2 != 0) {
                System.out.println("This is an odd number");
            }else {
                System.out.println("Invalid");
            }
        }
        input.close();

    }
}
