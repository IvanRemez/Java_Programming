package day30_Inheritance2.phoneTask;

public class iPhone extends Phone { // iPhone IS A Phone

    public iPhone(String model, String size, String color, double price) {
        super("Orange", model, size, color, price);
    }

    public static boolean hasApplePay = true;

    public void faceTime(long phoneNumber) {
        System.out.println(getModel() + " is faceTiming " + phoneNumber);
    }

    public void faceTime(String email) {
        System.out.println(getModel() + " is faceTiming with " + email);
    }

}
/*
2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)
 */