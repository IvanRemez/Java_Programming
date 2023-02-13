package day34_Interface.AnimalTask;

public class Dog extends Animal implements Playable{

    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getBreed() + " is eating dog food");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }

    public void bark(){
        System.out.println("Dog is barking");
    }
}
