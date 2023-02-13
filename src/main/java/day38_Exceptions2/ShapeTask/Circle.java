package day38_Exceptions2.ShapeTask;

public class Circle {

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

        if (radius <= 0){
            throw new InvalidShapeException("Radius of circle cannot be negative or zero: " + radius);
        }
        this.radius = radius;
    }
}
