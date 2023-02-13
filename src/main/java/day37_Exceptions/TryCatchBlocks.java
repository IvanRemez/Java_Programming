package day37_Exceptions;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Program started");

        try{
            System.out.println(9/0);    // ArithmeticException

            System.out.println("Try Block");

        } catch (ArithmeticException e){

            System.out.println("Catch Block");  // Catch block handles Unchecked Exc.
        }

        System.out.println("Program1 ended");
        System.out.println("-------------------------------------------");

        System.out.println("Program2 started");

        String str = null;

        try {
            System.out.println(str.toLowerCase());
            System.out.println("Try Block");

        }catch (RuntimeException e){
            System.out.println("Catch Block");  // Catch block handles Unchecked Exc.
        }

        System.out.println("Program2 ended");
        System.out.println("-------------------------------------------");

        System.out.println("Program3 started");

        try {
            Thread.sleep(3000);
            System.out.println("Try Block");    // Try block handles Checked Exception

        }catch (InterruptedException e){
            System.out.println("Catch Block");
        }

        System.out.println("Program3 ended");

    }
}
