package day43_Enums;

public enum Currency {

    PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
    // PENNY, NICKEL, etc., is an object of Currency class

    private int a; // can have fields, constructors, methods (NOT abstract)
                        // enum class CANNOT be Abstract b/c it is FINAL

    private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
