package day27_accessModifiers;

public class AccessModifiers {

    public static int publicData = 200;

    protected static int protectedData = 300;

    static int defaultData = 400;

    private static int privateData = 500;

    public AccessModifiers(){

    }

    public static void publicMethod(){
        System.out.println("Public");
    }

    protected static void protectedMethod(){
        System.out.println("Protected");
    }

    static void defaultMethod(){
        System.out.println("Default");
    }

    private static void privateMethod(){
        System.out.println("Private");
    }




    public static void main(String[] args) {

        System.out.println(publicData);
        // Public - accessible within the Same Class

        System.out.println(protectedData);
        // Protected - accessible within the Same Class

        System.out.println(defaultData);
        // Default - accessible within the Same Class

        System.out.println(privateData);
        // Private - ONLY accessible within the Same Class

        new AccessModifiers();

        publicMethod();
        protectedMethod();
        defaultMethod();
        privateMethod();



    }

}
