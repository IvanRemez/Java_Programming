package day26_statics;

public class ConstructorCalls {

// Constructor:
    public ConstructorCalls(){
        System.out.println("Default Constructor");
    }
    public ConstructorCalls(int a){
        // ConstructorCalls();
        // ^^ CANNOT call Constructors in another Constructor - SPECIAL Methods
        // have to use this() keyword:
        this();
        System.out.println("Constructor with int argument");
        // this(); // Constructor call HAS to be the 1st STEP
    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }

    public ConstructorCalls(String c){
        this(); // Default Constructor called
        //this(2.5); // 1 Constructor CANNOT call more than 1 Constructor
        System.out.println("Constructor with String argument");
    }


        public static void method1(){
        // this(); // compile error b/c ONLY a Constructor call another Constructor
        System.out.println("Method 1");
    }

    public static void method2(){
        method1();
        // ^^ Regular Methods - can be called in another Method by Method name
        System.out.println("Method 2");
        method1(); // regular method can be called at any step
        method2(); // regular methods CAN call themselves
    }

    public static void main(String[] args) {

        method1();

        System.out.println("--------------------------------------------");

        method2();

    }

}
