package day29_Inheritance.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',4,"Large","White");
    //  ^^setInfo gets called from Dog Class b/c it has inherited it from the Parent Animal Class

        Cat cat = new Cat();
        cat.setInfo("Felicia","Stray",'F',3,"Medium","BLack and White");

        Tiger tiger = new Tiger();
        tiger.setInfo("Shere Khan","Bengal",'M',5,"Large","Orange");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("----------------------------------------------------");

        dog.eat();
        dog.drink();
        dog.sleep();
        // ^^ these general methods also come from the Sub Class b/c they have been inherited

        cat.eat();
        cat.drink();
        cat.sleep();

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        System.out.println("----------------------------------------------------");

        dog.bark();
        //cat.bark();
        //tiger.bark();
        // ^^ only Dog Class has the unique bark() Method

        cat.meow();

        tiger.hunt();
        System.out.println("----------------------------------------------------");

        /*
        Object Class - Parent Class
        - comes with implicit Methods which can be used for ALL Objects

         */
        System.out.println("----------------------------------------------------");

        System.out.println(dog.getName());
        System.out.println(dog.getColor());

        dog.setGender('F');
        dog.setAge(8);

        System.out.println(dog);




    }
}
