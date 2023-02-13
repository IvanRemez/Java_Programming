package day26_statics;

public class ConstructorCalls2 {

    public ConstructorCalls2(){ // Print: Default
        System.out.println("Default");
    }

    public ConstructorCalls2(int a){ // Print: Default, int arg
        this(); // calling the Default constructor
        // ^^ call MUST be 1st step of body = Rule 3
        // this("A"); // CANNOT call more than 1 Constructor = Rule 4
        // this(9); // Constructor cannot call itself = Rule 5
        System.out.println("int arg");
    }

    public ConstructorCalls2(String a){ // Print: Default, int arg, String arg
        this(10);
        System.out.println("String arg");
    }

    public static void main(String[] args) {

        ConstructorCalls2 obj1 = new ConstructorCalls2(); // Default Constructor executed

        System.out.println("----------------------------------");

        ConstructorCalls2 obj2 = new ConstructorCalls2(10);
        // ^^ 2nd Constructor executed
        // 2nd Constructor CHAINED to the Default so both will be executed
        System.out.println("----------------------------------");

        ConstructorCalls2 obj3 = new ConstructorCalls2("Java");
        // ^^ 3rd Constructor executed
        // which will execute Default, int arg, and then String arg - all CHAINED
    }


}
