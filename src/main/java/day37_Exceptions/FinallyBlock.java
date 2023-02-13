package day37_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try {
            System.out.println(9/0);

        }catch (RuntimeException e){

            System.out.println("Runtime Exception");
            e.printStackTrace();
            System.exit(1);

        }finally {
            System.out.println("Finally block"); // Always executed unless forcefully exited
        }

        // the ONLY way to stop Finally Block from executing is to forcefully exit the program
            // System.exit(1);
    }
}
