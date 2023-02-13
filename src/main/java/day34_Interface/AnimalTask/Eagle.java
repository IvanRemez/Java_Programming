package day34_Interface.AnimalTask;

public class Eagle extends Animal implements Flyable, WildAnimal{

    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getBreed() + " is eating snake");
    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void hunt() {
        System.out.println("Eagle is hunting");
    }
}
