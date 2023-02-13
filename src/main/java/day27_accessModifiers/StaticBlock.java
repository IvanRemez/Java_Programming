package day27_accessModifiers;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("AppleTest Method");

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
        // ^^ ONLY executed ONCE
    }

    static { // ALWAYS runs 1st
        System.out.println("Static Block");
    }       // ^^ printed 1st


}
