package day16_nestedLoop;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String u, p;
        int attempt = 3;

        do {    // this Do...While Loop allows us to include statements and user
                // inputs BEFORE the condition is checked

            System.out.println("Enter your username:");
            u = input.next();

            System.out.println("Enter your password:");
            p = input.next();

            attempt--;

            if (attempt == 0){
                break;
            }

        }while (!(u.equals("Cydeo") && p.equals("WoodenSpoon")));
            // while credentials are INVALID this block will keep repeating
    }
}
