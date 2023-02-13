package day11_string2;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String user = input.nextLine();     // new keyword -> stored in Heap

        System.out.println("Enter your password: ");
        String pw = input.nextLine();

        String username = "Cydeo",      // literal -> stored in String Pool
                password = "WoodenSpoon";

        if (user.equals(username) && pw.equals(password)){
            System.out.println("You are now logged in");
        }else {
            System.err.println("Incorrect username or password. Please try again");
        }       // ^^ used to print in RED

        input.close();
    }
}
/*
2. Create a class named LogIn

			2.1 Ask the user to enter the username & password
			2.2 print "You are now logged in" If user entered valid username and
			password, otherwise print the error message "Incorrect username or
			password. Please try again"

			Note: Assume that the valid credentials are:
						username: Cydeo
						password: WoodenSpoon
 */