package day12_customMethods;

public class CustomMethodsWithParameter {

    public static void oddOrEven(int number){

        if (number % 2 == 0){
            System.out.println(number + " is even number");
        }else {
            System.out.println(number + " is odd number");
        }
        // this Method takes an argument (number) and verifies if it's odd or even
    }

    public static void main(String[] args) {

        oddOrEven(100);

        System.out.println("-----------------------------------");

        oddOrEven(10000);

    }
}
