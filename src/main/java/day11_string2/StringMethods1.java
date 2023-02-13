package day11_string2;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL";
        // remember created String is immutable -> you CANNOT modify existing String

        str1.toLowerCase(); // "cydeo school" <- new string, NOT modified

        System.out.println(str1); // str1 remains "CYDEO SCHOOL"

        str1 = str1.toLowerCase();
        // reassigned variable - now str1 is "cydeo school"

        System.out.println(str1);
        System.out.println("-----------------------------------");

        String str2 = "java programming";
        str2.toUpperCase(); // immutable - second object "JAVA PROGRAMMING" is created

        System.out.println(str2); // "java programming"

        String str3 = str2.toUpperCase(); // "JAVA PROGRAMMING"
        // new variable str3 if you want to keep original str2 for future reference
        System.out.println(str3);
        System.out.println("-----------------------------------");

        String word = "Wooden Spoon";

        word = word.toUpperCase(); // new string created -> "WOODEN SPOON"

        word = word.toLowerCase(); // new string -> "wooden spoon"

        System.out.println(word);
        System.out.println("-----------------------------------");

        String str4 = "     Cydeo School";
                    // ^^ white spaces -> also added in output

        str4.trim(); // gets rid of white spaces = "Cydeo School"
        str4 = str4.trim(); // new trimmed object

        System.out.println(str4);
        System.out.println("-----------------------------------");

        String sentence1 = "Today is Sunday, and we have Java Class";

        int index1 = sentence1.indexOf('w');
        System.out.println(index1);
        System.out.println("-----------------------------------");

        String s1 = "I Love Java Programming";
        s1.indexOf('a');

        int firstA = s1.indexOf('a');
        System.out.println(firstA);

        int secondA = s1.indexOf("a ");
            // "" used when you need a specific sequence of characters "a "
            // the index returned is of the first char in the sequence  ^ = a = 10
        System.out.println(secondA);
        System.out.println("-----------------------------------");

        String s2 = "Java Python JavaScript Cydeo Python";
        int a1 = s2.indexOf('a');
        System.out.println(a1); // index = 1

        int a2 = s2.indexOf("a Python");
        System.out.println(a2); // 2nd a so index = 3

        int a3 = s2.indexOf("avaS");
        System.out.println(a3); // 3rd a

        int a4 = s2.indexOf("aS");
        System.out.println(a4); // 4th a
        System.out.println("-----------------------------------");

        // indexOf() - searches string LEFT to RIGHT
        // lastIndexOf() - searches string RIGHT to LEFT

        String w = "Java";
        System.out.println(w.indexOf('a')); // index = 1
        System.out.println(w.lastIndexOf('a')); // index = 3

        String w2 = "Java Python JavaScript Cydeo Python";
        System.out.println(w2.lastIndexOf('a'));
        // first a going RIGHT to LEFT -> index = 15

        System.out.println(w2.lastIndexOf('P')); // Last P = 29


    }
}
