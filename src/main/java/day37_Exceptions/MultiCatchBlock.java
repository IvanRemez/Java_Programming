package day37_Exceptions;

import day35_Polymorphism.TransportationTask.Car;

public class MultiCatchBlock {

    public static void main(String[] args) {

        System.out.println("Program1 started");

        Car car = null;

        try {
            car.drive(); // ^^ NO car object so can't call its methods
                // ^^ NullPointerException

        }catch (ArithmeticException e){

            System.out.println("1st Catch Block");
            e.printStackTrace();

        }catch (ClassCastException e){

            System.out.println("2nd Catch Block");
            e.printStackTrace();

        }catch (NullPointerException e){

            System.out.println("3rd Catch Block"); // fish caught - print
            e.printStackTrace();

        }catch (IndexOutOfBoundsException e){

            System.out.println("4th Catch Block");
            e.printStackTrace();

        }catch (RuntimeException e){    // Parent exc. class placed AFTER the child classes

            System.out.println("4th Catch Block");
            e.printStackTrace();
        }

        System.out.println("Program1 ended");
        System.out.println("-------------------------------------------");
    }
}
