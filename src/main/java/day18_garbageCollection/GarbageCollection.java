package day18_garbageCollection;

import day17_customClass.Dog;

public class GarbageCollection {

    public static void main(String[] args) {

        String s1 = "Java";
        s1 = null; // "Java" is now eligible for Garbage Collection

        System.out.println(s1); // returns null - no memory usage

        //System.out.println(s1.toUpperCase());
        // NullPointerException - no object to reference to

        //System.out.println(s1.replace(null, "Python"));
        // cannot replace an object that doesn't exist

        String a = ""; // object
        String b = null; // no object

        System.out.println("------------------------------------");

        String str1 = "Python";
        str1 = "CYDEO"; // replaces "Python" and makes it eligible as garbage

        System.out.println(str1);
        System.out.println("------------------------------------");

        Dog dog1 = new Dog();
        dog1.setInfo("Loki", "Chow chow", 'M', 3, "Medium", "Black");

        Dog dog2 = new Dog();
        dog2.setInfo("Chuck", "Bulldog", 'M', 5, "Small", "White");

        dog1 = dog2; // now dog1 referenced to dog 2 and is eligible for garbage collection

        System.out.println(dog1);
        System.out.println(dog2);

        // new Dog().finalize(); --> implicit Method given to every single Object
    }
}
