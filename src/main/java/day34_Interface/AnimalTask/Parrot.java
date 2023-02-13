package day34_Interface.AnimalTask;

public class Parrot extends Animal implements Playable, Flyable{

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getBreed() + " is eating seeds");
    }

    @Override
    public void play() {
        System.out.println("Parrot is playing");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}
