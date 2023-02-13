package day12_customMethods;

public class CustomMethodsIntro {

    public static void greetings(){             // can be placed before AppleTest Method
                                            // but CANNOT be inside another Method
        System.out.println("Hello Cydeo");
        System.out.println("How are you today?");
        System.out.println("Are you ready to learn Java?");

    }

    public static void main(String[] args) {

        System.out.println("Builder Started");

        greetings();        // "Hello Cydeo"
                            // "How are you today?"

        System.out.println("Builder Completed");
        System.out.println("-----------------------------------");

        displayMessage();

    }

    public static void displayMessage(){
        System.out.println("Hello World");
        System.out.println("I love Java");
    }

}
