package day38_Exceptions2;

import java.io.FileInputStream;

public class ThrowsKeyword2 {

    public static void main(String[] args) {


    }

// ** throws in method signature - TEMPORARY - ignores the exception once

    public static void pauseFor5Seconds() throws InterruptedException {

        Thread.sleep(5000);
        System.out.println("--------------------------------------------------");

    }

    public static void method1() throws InterruptedException {
        System.out.println("Hello World");
        pauseFor5Seconds();
        System.out.println("Hello Cydeo");
    }
/*
    public static void method2(){

        System.out.println("Program1 Started");

        Thread.sleep(3000);

        System.out.println("Program1 Ended");

        new FileInputStream("");

        Thread.sleep(5000);
    }

 */

}
