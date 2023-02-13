package day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor(){
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Block");
    }

    static {
        System.out.println("Static BLock");
    }

    public static void main(String[] args) {

        System.out.println("AppleTest Method");

        new StaticBlock_vs_InstanceBlock_vs_Constructor();

    }


}
