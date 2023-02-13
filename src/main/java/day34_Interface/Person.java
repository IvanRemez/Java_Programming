package day34_Interface;

import day34_Interface.AnimalTask.Playable;
import day34_Interface.AnimalTask.Swimmable;

public class Person implements Playable, Swimmable {

    @Override
    public void play() {
        System.out.println("Person is playing");
    }

    @Override
    public void swim() {
        System.out.println("Person is swimming");
    }

}
