package day36_Polymorphism2;

import day30_Inheritance2.phoneTask.Nokia;
import day30_Inheritance2.phoneTask.Phone;
import day30_Inheritance2.phoneTask.Samsung;
import day30_Inheritance2.phoneTask.iPhone;

public class PolymorphismPractice {

    public static void main(String[] args) {

        //   IPhone phone = new Phone("Iphone 11 Pro", "Large", "Black", 900);

        //Phone phone =  new Samsung("Galaxy S19", "Medium", "Pink", 700);


        Phone[] phones = {
                new iPhone("Iphone 11 Pro", "Large", "Black", 900),
                new iPhone("Iphone 12 Pro Max", "Large", "Black", 1200),
                new iPhone("Iphone 9", "Medium", "Gold", 800),
                new Samsung("Galaxy S19", "Medium", "Pink", 700),
                new Samsung("Galaxy S20", "Large", "Silver", 850),
                new Samsung("Galaxy S21", "Large", "Black", 950),
                new Nokia("XR20", "Small", "Blue", 350),
                new Nokia("G10", "Medium", "Gray", 99),
                new Nokia("G50", "Large", "Silver", 250),
                new iPhone("Iphone 12 Pro", "Large", "Black", 1200),
                new iPhone("Iphone 11 Pro Max", "Large", "Silver", 1100),
                new Samsung("Galaxy S18", "Medium", "White", 750),
                new Samsung("Galaxy S17", "Large", "Silver", 650),
                new Nokia("G10", "Medium", "Black", 99),
                new iPhone("Iphone 6", "Smalle", "Gold", 400),
                new iPhone("Iphone 7", "Smalle", "White", 500)
        };

        for (Phone eachPhone : phones) {
            System.out.println(eachPhone.getModel() + " - " + eachPhone.getColor()
                    + " - " + eachPhone.getPrice());
        }

        System.out.println("---------------------------------------------------------");

        int countIphone = 0;
        int countSamsung = 0;

        for (Phone eachPhone : phones) {
            if (eachPhone instanceof iPhone){   // if phone is iPhone
                countIphone++;
            } else if (eachPhone instanceof Samsung) {  // if phone is Samsung
                countSamsung++;
            }
        }

        System.out.println(countIphone);
        System.out.println(countSamsung);
        System.out.println("---------------------------------------------------------");

        for (Phone eachPhone : phones) {
            if (eachPhone instanceof iPhone || eachPhone instanceof Samsung){
                if (eachPhone.getPrice() >= 700){
                    System.out.println(eachPhone.getModel());
                }
            }
        }

    }
}
/*
1. print the model, color and price of each phone object in the following format
    				model - color - price
	2. How many Iphone in the array of phones?
	3. How many Samsung in the array of phones?
	4. Display the models of Iphone and Samsung that has the price of 700 or greater
 */