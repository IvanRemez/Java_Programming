package day34_Interface.CarTask;

public abstract class Car {

    private final String make, model;
    private String color;
    private final int year;
    private double price;

    public Car(String model, String color, int year, double price) {
        this.make = getClass().getSimpleName(); // subclass name will be set to make
        this.model = model;
        setColor(color);
        if (year < 1886){
            System.err.println("Year cannot be less than 1886");
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price <= 0){
            System.err.println("Price cannot be negative or zero");
            System.exit(1);
        }
        this.price = price;
    }

    protected final void stop(){
        // protected - only accessible outside package if inside subclass
            // prevents NON subclasses outside package from accessing this method

        System.out.println("Press the brake to stop " + make + " " + model);
    }

    protected abstract void start();
        // Abstract method MUST be inside an Abstract class
        // Meant to be overridden

    @Override
    public String toString() {
        return make + "{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car){ // if the given object is iPhone

            if (model.equals(((Car) obj).model)) {
                if (make.equals(((Car) obj).make)){
                    if (year == ((Car) obj).year){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
/*
	1. Create an abstract class named Car
			variables:
				make (final), model (final), color, year (final), price
			Encapsulate all the fields
				Conditions:
					1. year can not be less than 1886
					2. price can not be negative or zero
			Add a constructor that can set all the fields
				Note: Class name can be set to the make of the car
			Methods:
				stop() (final): prints "Press the brake"
				start() (abstract)
				toString(): prints the given car info when a car object is passed
				in the print statement
 */