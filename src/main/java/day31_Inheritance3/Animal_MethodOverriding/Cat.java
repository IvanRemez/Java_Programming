package day31_Inheritance3.Animal_MethodOverriding;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Cat " + getName() + " is eating cat food");
    }

    @Override
    public void sleep() {
        System.out.println("Cat " + getName() + " sleeps 12 hours a day");
    }

    public void scratch(){
        System.out.println(getName() + " is scratching");
    }
}
