package day19_array;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {

        String[] myGroup = new String[5];

        myGroup[0] = "Gulcin";
        myGroup[myGroup.length - 1] = "Aseel";
        myGroup[2] = "Sumeye";
        //myGroup[1] = 100; // error - data types MUST stay the same
        myGroup[1] = "Abidullah";
        myGroup[3] = "Khashayar";

        System.out.println(Arrays.toString(myGroup));

        myGroup[1] = "Kuzzat"; // new element replaces old one
        //myGroup[5] = "Muhtar"; // out of bounds exception

        System.out.println(Arrays.toString(myGroup));
        System.out.println("---------------------------------------");

        // Task: Print elements in reverse order

        for (int i = myGroup.length - 1; i >= 0; i--) {

            System.out.println(myGroup[i]); // prints names in reverse order
        }
        // Reverse Array Loop Shortcut: myGroup. + forr + Enter

        System.out.println("---------------------------------------");

    }
}
