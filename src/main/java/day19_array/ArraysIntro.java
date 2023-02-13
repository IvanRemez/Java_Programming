package day19_array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int score1 = 85;
        int score2 = 75;
        int score3 = 78;
        int score4 = 88;
        int score5 = 95;
        // without Array, you need to create 5 different variables
        // to contain 5 elements of data

        System.out.println("---------------------------------------");

        // One dimensional Array with 5 elements (SAME data type):

        int[] scores = new int[5]; // index #s: 0 - 4

        scores[0] = 85;
        scores[1] = 75;
        scores[2] = 78;
        scores[3] = 88;
        scores[4] = 95;

        // scores[5] = 100; // out of bounds exception
        // scores[-1] = 65; // also out of bounds
        // # of elements assigned when array is created is IMMUTABLE

        //scores = new int[10]; // NEW object - old elements remain with OLD variable
        // index: 0 - 9          OLD variable eligible for garbage collection
        //scores = new int[50]; // another NEW object - old objects eligible for GC
        // index: 0 - 49

        System.out.println(Arrays.toString(scores));
        System.out.println(scores[2]); // score at index = 2 (78)

        System.out.println("---------------------------------------");

        for (int i = 0; i < scores.length; i++) { // i: index #s of scores array

            System.out.println(scores[i]); // prints each score
        }
        System.out.println("---------------------------------------");

        System.out.println(scores[scores.length - 1]); // last score in Array




    }
}
