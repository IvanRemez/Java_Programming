package day13_customMethods2;

public class ReturnStatement {

    public static void eligible(int age){

        if (age < 0 || age > 150){
            System.err.println("Invalid age: " + age);
            return; // exits the method
        }       // if the age is invalid, the method gets terminated
                // rest of script not read

        if (age >= 21){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("NOT eligible to buy alcohol");
        }
    }

    public static int multiplication(int n1, int n2){
        int result = n1 * n2;
        return result;
    }

    public static void main(String[] args) {

        eligible(25);
        System.out.println("-----------------------------------");

        System.out.println("Builder Started");
        boolean exit = true;
        if (exit){
            return;     // exits current method - AppleTest method terminated
        }

        System.out.println("Builder 1 Completed");
                // won't print because main method was exited ^^ due to return statement

    }
}
