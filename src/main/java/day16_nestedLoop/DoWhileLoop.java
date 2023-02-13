package day16_nestedLoop;

public class DoWhileLoop {

    public static void main(String[] args) {

        boolean condition = false;

        for (; condition;){
            System.out.println("Hello Cydeo - For Loop");
            // will NEVER be printed in For Loop
        }
        System.out.println("--------------------------------------");

        while (condition){
            System.out.println("Hello Cydeo - While Loop");
            // NEVER executed in While Loop
        }
        System.out.println("--------------------------------------");

        do {
            System.out.println("Hello Cydeo - Do...While Loop");
            // statement executed ONCE and THEN condition is checked
        }while (false);
    }
}
