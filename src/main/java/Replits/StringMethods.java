package Replits;

import java.util.Scanner;

public class StringMethods {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Select screen size:");
        String screenSize = input.nextLine();

        double totalPrice = 0;

        switch (screenSize){

            case "13.3":
                totalPrice += 200;
                break;
            case "15.0":
                totalPrice += 300;
                break;
            case "17.3":
                totalPrice += 400;
                break;
        }
        System.out.println("Select CPU type:");
        String CPU = input.nextLine();

        switch (CPU){

            case "i3":
                totalPrice += 150;
                break;
            case "i5":
                totalPrice += 250;
                break;
            case "i7":
                totalPrice += 350;
        }
        System.out.println("Select RAM size:");
        int RAM = input.nextInt();

        totalPrice += 50 * (RAM / 4);

        System.out.println("Select storage type:");
        String storageType = input.next();

        System.out.println("Select storage size:");
        int storageSize = input.nextInt();

        switch (storageType){
            case "HDD":
                totalPrice += 50 * (storageSize / 500);
                break;
            case "SSD":
                totalPrice += 100 * (storageSize / 500);
        }

        System.out.println("Select screen resolution:");
        switch (input.next()){
            case "FULLHD":
                totalPrice += 100;
                break;
            case "4K":
                totalPrice += 200;
                break;
        }
        System.out.println("Final price is: $" + totalPrice);
    }
}
