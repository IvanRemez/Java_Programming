package day16_nestedLoop;

import java.util.Scanner;

public class CydeoLogin {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username:");
        String u = input.next();

        System.out.println("Enter your password:");
        String p = input.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")) { // if credentials are valid
            System.out.println("Logged in.");
        } else {     // otherwise

            for (int i = 0; i < 3; i++) {  // i: 0, 1, 2

                if (i != 2){
                    System.err.println("Incorrect username or password. Please re-enter.");
                }else {
                    System.err.println("This is your last chance. Please re-enter your username and password");
                }
                // ^^ extra condition warning the user about their last attempt

                System.out.println("Enter your username:");
                u = input.next();

                System.out.println("Enter your password:");
                p = input.next();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) {  // if user enters valid credentials
                    System.out.println("You are now logged in");
                    break;  // exits the loop
                }
            }
            // if after all 3 attempts the credentials are still invalid,
            // account locked message is displayed:
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))) {
                System.err.println("Your account is locked.");
            }
        }

        input.close();

    }
}
/*
7. you are writing a code for the log-in function of the Cydeo Application, assume
that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the
                user to have three attempts to enter correct credentials and if
                all three attempts are failed, then print "Your account is locked."
 */