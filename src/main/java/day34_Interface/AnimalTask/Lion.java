package day34_Interface.AnimalTask;

public class Lion extends Animal implements WildAnimal{

    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getBreed() + " is eating buffalo");
    }

    @Override
    public void hunt() {
        System.out.println("Lion is hunting");
    }
}
