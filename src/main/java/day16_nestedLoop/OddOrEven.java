package day16_nestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true){

            System.out.println("Enter a number:");
            int number = input.nextInt();

            if (number % 2 == 0){
                System.out.println(number + " is an Even number");
            }else {
                System.out.println(number + " is an Odd number");
            }

            System.out.println("Would you like to enter another number? Yes/No");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))){
                // while answer is INVALID
                System.err.println("Invalid Entry! Would you like to enter another number? Yes/No");
                answer = input.next().toLowerCase();
            }
            // ^^ need to add this nested loop to avoid any answer other than "yes" or "no"

            if (answer.equals("no")){
                break;
            }

        }


    }
}
