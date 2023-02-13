package day34_Interface;

import day34_Interface.AnimalTask.Flyable;

public class Airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }
}
