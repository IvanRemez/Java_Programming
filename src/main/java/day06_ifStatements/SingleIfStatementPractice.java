package day06_ifStatements;

public class SingleIfStatementPractice {

    public static void main(String[] args) {

        int number = 155;
        boolean isEven = number % 2 == 0,
                isOdd = !isEven;
        if (isEven){
            System.out.println("Even number");
        }
        if (isOdd){
            System.out.println("Odd number");
        }
        // OR
        if (!isEven){
            System.out.println("Odd number"); // opposite of even //
            // isOdd variable not used
        }
        // OR
        if (number % 2 != 0){
            System.out.println("Odd number"); // boolean variable NOT used
        }

    }
}
