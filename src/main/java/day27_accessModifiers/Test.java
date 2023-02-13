package day27_accessModifiers;

public class Test {

    public static void main(String[] args) {

        // new StaticInitializationBlock();

        System.out.println(StaticInitializationBlock.a);
        // static block executed once as soon as the class is called
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

// Static Block used to initialize Static Variables
// Constructor used to initialize Instance Variables

        System.out.println("----------------------------------------");

        System.out.println(AccessModifiers.publicData);
        // Public - accessible within the Same Package

        System.out.println(AccessModifiers.protectedData);
        // Protected - accessible within the Same Package

        System.out.println(AccessModifiers.defaultData);
        // Default - accessible within the Same Package

        // System.out.println(privateData);
        // Private - NOT accessible within the Same Package

        new AccessModifiers();


    }
}
