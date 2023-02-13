package day28_Encapsulation.PersonTask;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person p1 = new Person("Ivan");

        Person p2 = new Person("John", 'M');

        Person p3 = new Person("Steve",30);

        Person p4 = new Person("Daniel", "English");

        Person p5 = new Person("Amy",25,'F');

        Person p6 = new Person("Lucy",31,'F',"English");

        p4.name = "James";

        // p1.planet = "Mars";
        Person.planet = "Mars";

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);

        Person.printPlanetName();

        p1.eat("Baklava");

        p2.drink("Water");

    }
}
