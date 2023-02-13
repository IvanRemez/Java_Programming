package day27_accessModifiers;

public class StaticInitializationBlock {

    public static int a;
    public static double b;
    public static String c;

// public static ExcelSheet sheet; // need SEVERAL STEPS to initialize:
            // 1. Get file 2. Read file 3. Get sheet 4. Assign to sheet variable
    // this is why we need static block which will perform these steps for us

    static {
        a = 100;
        b = 20.5;
        c = "Java";
    }


    /*
    public StaticInitializationBlock(){
        a = 100;
        b = 20.5;
        c = "Java";
    }
     */
    // will initialize static variables BUT need to create NEW Object in the other class
    // Also, executed each time NEW Object is created - waste of memory

}
