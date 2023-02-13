package Utilities;

// import day27_accessModifiers.Data; // don't need entire class

import day27_accessModifiers.Data;

//import static day27_accessModifiers.Data.d;
//import static day27_accessModifiers.Data.method3;

import static day27_accessModifiers.Data.*; // * used to import ALL Static Members
    // ^^ Imports ALL Static Members of Data class

public class Test2 {

    public static void main(String[] args) {

        // System.out.println(Data.d);
        // Static member (variable) d is imported so don't even need to call class name
        System.out.println(d);

        method3();

        System.out.println(e);
        System.out.println(f);

        method4();

        /*

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        method1();
        method2();

        ^^ these are Instance NOT STATIC

         */


    }
}
