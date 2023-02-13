package day29_Inheritance.AnimalTask;

public class Dog extends Animal { // Dog IS AN Animal
    //       ^^Child       ^^Parent

    // import = variables & methods are borrowed
    // vs.
    // inheriting = variables & methods become a member of this Class

    /*
    public void method(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);

        setInfo();
        eat();
        drink();
        sleep();
        toString();
    }
    */

    public void bark(){
        System.out.println(getName() + " is barking");
    }

}
