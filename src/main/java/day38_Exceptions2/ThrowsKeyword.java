package day38_Exceptions2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

        System.out.println("Program1 Started");

        // System.out.println(100/0);

        /*
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
         */
        // throws keyword = less code and faster than try & catch block
        // used when exception doesn't need to be handled right away

        Thread.sleep(1000);

        System.out.println("Program1 Ended");
        System.out.println("--------------------------------------------------");

        System.out.println("Program2 Started");

        Thread.sleep(1000);

        System.out.println("Program2 Ended");
        System.out.println("--------------------------------------------------");

        System.out.println("Program3 Started");

        FileInputStream file = new FileInputStream("");

        System.out.println("Program3 Ended");
    }
}
