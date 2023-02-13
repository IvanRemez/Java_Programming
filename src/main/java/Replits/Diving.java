package Replits;

import java.util.Arrays;
import java.util.Scanner;

public class Diving {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        float difficulty = 0;
        double finalScore = 0;

        for (int i = 1; i <= score.length; i++) {

            System.out.println("Enter score for judge " + i + ":");
            score[i - 1] = input.nextFloat();
        }
        System.out.println("Enter the difficulty rating:");
        difficulty = input.nextFloat();

        Arrays.sort(score);
        score[0] = 0;
        score[6] = 0;
        float sumArray = 0;

        for (float eachScore : score) {
            sumArray += eachScore;
        }
        finalScore = sumArray * difficulty * 0.6;
        System.out.println("Final Score: " + finalScore);

    }
}
