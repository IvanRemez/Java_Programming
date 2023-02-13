package day26_statics;

public class IPhone {

    public static String brand = "Orange";
    // static b/c all objects will have the same brand - Orange
    public String model;
    // instance b/c different models for each object (each phone)
    public String color;
    public double price;
    public static String OS = "iOS";
    // static b/c OS is the same for all iPhones - iOS
    public static String madeIn = "China";
    // all iPhones made in China
    public static boolean hasBattery = true;
    public static boolean hasTouchScreen = true;
    public static boolean isExpensiveToFix = true;

    /*
    public static void printPhoneInfo(){ // Static ONLY accepts Statics
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
    }
     */

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void printPhoneInfo(){       // Instance Method (uses instance variables)
                                        // BUT can accept BOTH Static AND Instance
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }

    public static void printOperatingSystem(){
        System.out.println("Operating System: " + OS);
    }





}
/*
Attributes:
    brand, model, color, price, OS, madeIn, hasBattery, hasTouchScreen, isExpensiveToFix

 */