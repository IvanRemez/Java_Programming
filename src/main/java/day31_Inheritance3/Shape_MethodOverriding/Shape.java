package day31_Inheritance3.Shape_MethodOverriding;

public class Shape {

    private String name;

    public Shape(){
        setName(getClass().getSimpleName());
        // Default constructor which allows us to set the Name of each shape using the
            // subclass' name
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    public void draw(){
        System.out.println("Drawing a " + getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
