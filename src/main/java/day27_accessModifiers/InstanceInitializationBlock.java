package day27_accessModifiers;

public class InstanceInitializationBlock {

    public String name;
    public int age;

    /*
    {   // sets all known instance variables to the specified default values:

        name = "James"; // executed for EVERY single Object
        age = 20;
    }
     */

    public InstanceInitializationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

/*
        InstanceInitializationBlock obj1= new InstanceInitializationBlock();
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock();

        System.out.println(obj1.name); // James
        System.out.println(obj2.name); // Also James - default value set by Instance Block
*/

        InstanceInitializationBlock obj1 = new InstanceInitializationBlock("James",25);
        InstanceInitializationBlock obj2 = new InstanceInitializationBlock("Aaron",28);

        System.out.println(obj1.name);
        System.out.println(obj2.name);



    }

}
