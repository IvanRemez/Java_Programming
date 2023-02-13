package day31_Inheritance3.Animal_MethodOverriding;

public class Lion extends Animal{

    private boolean isAfricanLion;

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion; // unique Subclass variable
    }

    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        setAfricanLion(isAfricanLion); // unique variable added to Constructor
    }

    @Override
    public void eat() {
        System.out.println("Lion " + getName() + " is eating deer");
    }

    public void roar(){
        System.out.println(getName() + " is roaring");
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                // ^^ calls the Parent class toString - avoids repetition
                // also replaces "}" with ("") Empty String to continue with unique variables
                    // stated below:
                ", isAfricanLion='" + isAfricanLion + '\'' +
                '}';
    }
}
