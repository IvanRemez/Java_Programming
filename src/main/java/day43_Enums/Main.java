package day43_Enums;

public class Main {

    public static void main(String[] args) {

        System.out.println("How to access a constant:");

        Currency c = Currency.DIME; // static constant -> through Class Name
        System.out.println(c);
        System.out.println(Currency.PENNY); // can also write directly

        //Orange a = new Orange();
        //System.out.println(a); // memory space name - hashcode - need to use toString

        System.out.println("How to get ALL constants:");

        Currency[] currencies = Currency.values(); // no new - no object creation in Enums

        for (Currency currency : currencies) {
            System.out.println(currency);       // prints ALL currencies
        }

        System.out.println("How to use switch-case with enums:");

        switch (Currency.PENNY){
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKEL:
                System.out.println("It is 5 cent");
                break;
            case DIME:
                System.out.println("It is 10 cent");
                break;
            case QUARTER:
                System.out.println("It is 25 cent");
                break;
        }

        System.out.println("Operation Task:");

        calculate(3,5,Operation.PLUS);

        System.out.println("How to retrieve the constant value:");

        System.out.println(Currency.PENNY.getValue());
        System.out.println(Currency.QUARTER.getValue());
        System.out.println(Currency.QUARTER.ordinal()); // index - 3

    }

    private static void calculate(double x, double y, Operation operation){

        switch (operation){
            case PLUS:
                System.out.println(x + y);
                break;
            case MINUS:
                System.out.println(x - y);
                break;
            case MULTIPLY:
                System.out.println(x * y);
                break;
            case DIVIDE:
                System.out.println(x / y);
                break;
        }
    }
}
