package day34_Interface.AnimalTask;

public class Cat extends Animal implements Playable{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getBreed() + " is eating cat food");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
