package day05_operators;

public class RelationalOperators2 {

    public static void main(String[] args) {

        // ==: Equal operator
        // can be used to compare any variables with the same data type

        System.out.println(1000==2000);
        System.out.println("Java" == "Java"); // true
        System.out.println("java"=="JAVA"); // case sensitive = false
        System.out.println("Muhtar"=="Good Guy"); // false
        System.out.println(true==false);
        System.out.println("------------------------------------");

        // !=: NOT Equal operator

        System.out.println(1000!=2000); // true
        System.out.println("Java" != "Java"); // false
        System.out.println("java"!="JAVA"); // case sensitive = true
        System.out.println("Muhtar"!="Good Guy"); // true
        System.out.println(true!=false);
        System.out.println("------------------------------------");

    }
}
