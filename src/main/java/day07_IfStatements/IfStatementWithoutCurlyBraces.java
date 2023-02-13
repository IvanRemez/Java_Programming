package day07_IfStatements;

public class IfStatementWithoutCurlyBraces {

    public static void main(String[] args) {

        int age = 32;

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }

        System.out.println("---------------------------------------");

        if (age >= 21) System.out.println("Eligible");
            // if only ONE statement given, no need for CURLY BRACES
        else System.out.println("Not Eligible");

        System.out.println("---------------------------------------");

        int itemNum = 1;

        if (itemNum == 1) {
            System.out.println("Eggs");
            System.out.println("Orange"); // 2 Statements given so need {}
        } else if (itemNum == 2) {
            System.out.println("Milk");
            System.out.println("Onion");
        } else {
            System.out.println("Orange");
            System.out.println("Cherry");
        }
        System.out.println("---------------------------------------");

        int day = 2; // 1 ~ 7

        if (day == 1) System.out.println("Monday");
                    // No need to include curly braces {} if there's only one statement
        else if (day == 2) System.out.println("Tuesday");
            // only ONE (1) Statement given so {} optional
        else if (day == 3) System.out.println("Wednesday");
        else if (day == 4) System.out.println("Thursday");

    }
}
