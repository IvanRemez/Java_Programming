package day26_statics;

public class TestIphoneObjects {

    public static void main(String[] args) {

        IPhone iPhone = new IPhone("iPhone12","Black",1000);

        // Instances should be accessed through Instance NOT Class:

        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);

        iPhone.printPhoneInfo();

        // Statics should be accessed through Class NOT Instance:

        System.out.println(iPhone.brand); // accessed through INSTANCE - WRONG
        System.out.println(iPhone.OS);
        iPhone.printOperatingSystem();

        System.out.println(IPhone.brand); // accessed through CLASS - RIGHT


    }
}
