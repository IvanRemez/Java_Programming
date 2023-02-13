package day30_Inheritance2.phoneTask;

public class TestPhoneObjects {

    public static void main(String[] args) {

        iPhone iphone = new iPhone("iPhone 12","Large","Black",1000.5);

        Samsung samsung = new Samsung("Galaxy S22","Medium","White",1100);

        Nokia nokia = new Nokia("Brick","Small","Pink",50);

        iphone.call(911);
        samsung.call(911);
        nokia.call(911);

        iphone.text(123456789);
        samsung.text(123456789);
        nokia.text(123456789);
        System.out.println("------------------------------------------------------");

        iphone.faceTime(123456789);
        // samsung.faceTime -> method doesn't exist

        samsung.freeze();
        // iphone.freeze() -> method doesn't exist

        nokia.selfDefense();
        // iphone.selfDefense() -> method doesn't exist

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

    }
}
