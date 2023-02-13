package day43_Enums;

public enum Operation {

    PLUS, MINUS, MULTIPLY, DIVIDE;  // each constant is (new)Object of Operation


    Operation() {
        System.out.println("Constructor");
    }
                    // will execute with each new Object

}
