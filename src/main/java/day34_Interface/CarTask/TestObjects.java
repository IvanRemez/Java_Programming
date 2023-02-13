package day34_Interface.CarTask;

public class TestObjects {

    public static void main(String[] args) {

        //  Car car1 = new Car("X6", "Red", 2020, 45000);

        Honda honda = new Honda("Pilot", "Black", 2019, 35000);

        Audi audi = new Audi("Q6", "Silver", 2020, 36000);

        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);

        Tesla tesla2 = new Tesla("Model Y", "Black", 2022, 80000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("--------------------------------------------");

        honda.stop();
        audi.stop();
        tesla.stop();

        System.out.println("--------------------------------------------");

        honda.start();
        audi.start();
        tesla.start();

        System.out.println("--------------------------------------------");
        audi.autoPark();
        tesla.autoPilot();
        System.out.println("--------------------------------------------");

        System.out.println(honda.equals(audi));
        System.out.println(tesla.equals(tesla2));
    }
}
