package day34_Interface.AnimalTask;

public interface Playable {

    public static final boolean isFriendly = true;
    // public, static, & final by default

    /*
    private static void main(String[] args) {
        // static methods in Interface can be private

        System.out.println(isFriendly);

        // isFriendly = false; // cannot change static & final variable
    }

    // public by default
    public default void method1(){

    }
     */

    // public & abstract by default
    public abstract void play();

}
