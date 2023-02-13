package day34_Interface.AnimalTask;

public class Dolphin extends Animal implements Playable, Swimmable{

    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getBreed() + " is eating fish");
    }

    @Override
    public void play() {
        System.out.println("Dolphin is playing");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin is swimming");
    }
}
