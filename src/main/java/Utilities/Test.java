package Utilities;

import day27_accessModifiers.AccessModifiers;
import day27_accessModifiers.Data;

public class Test {

    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj = new Data();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();

        System.out.println("----------------------------------------");

        System.out.println(AccessModifiers.publicData);
        // Public - Always accessible Outside the Package

        // System.out.println(AccessModifiers.protectedData);
        // Protected - NOT always accessible OUTSIDE the Package
            // can be accessible through creating a Subclass

        // System.out.println(AccessModifiers.defaultData);
        // NEVER accessible OUTSIDE the Package

        // System.out.println(privateData);
        // Private - NEVER accessible OUTSIDE the Package

        new AccessModifiers();



    }
}
