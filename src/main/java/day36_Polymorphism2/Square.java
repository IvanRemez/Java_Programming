package day36_Polymorphism2;

public class Square {

    private double side;

    public Square(double side) {
        // this() - implicitly calls the Parent class' Constructor
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }

    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                ", side='" + side + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Square)){
            System.err.println("Invalid Object - Object must be a square");
            System.exit(1);
        }
        if (side == ((Square) obj).side){
            return true;
        }
        return false;
    }
}
