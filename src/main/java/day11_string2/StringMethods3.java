package day11_string2;

public class StringMethods3 {

    public static void main(String[] args) {

        String word = "Java";
        boolean r1 = word.isEmpty();

        System.out.println(r1); // false
        System.out.println("-----------------------------------");

        String str = "          "; // Blank but NOT Empty
        boolean r2 = str.isEmpty();
        boolean r3 = str.isBlank();

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("-----------------------------------");

        String str1 = "Cydeo";
        String str2 = new String("Cydeo"); // 2 different objects with same text

        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true - same text (literal)

        String str3 = new String("cydeo");

        System.out.println(str2.equals(str3)); // false - case sensitivity
        System.out.println("-----------------------------------");

        String s1 = "JAVA";
        String s2 = "java";

        System.out.println(s1.equals(s2)); // false - case sensitivity
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        System.out.println("-----------------------------------");

        String students = "Hasan Naran Sumeye Nataliia";

        boolean hasAhmed = students.contains("Ahmed"); // false
        System.out.println(hasAhmed);

        String sentence = "My favorite programming language is JAVA";

        boolean hasJava = sentence.toLowerCase().contains("java");
        // false - case sensitivity, adding ^^ makes it true
        System.out.println("hasJava = " + hasJava);
        System.out.println("-----------------------------------");

        String name = "Michael";

        boolean l = name.startsWith("Da"); // false
        System.out.println(l);

        String url = "www.cydeo.com";

        boolean isValid = url.startsWith("www."); // true
        System.out.println(isValid);

        boolean t = url.endsWith(".com"); // true
        System.out.println(t);
        System.out.println("-----------------------------------");

        String email = "CydeoSchool@gmail.com";

        boolean isGmail = email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");
        boolean isHotMail = email.endsWith("hotmail.com");

        System.out.println(isGmail); // true
        System.out.println(isYahoo); // false
        System.out.println(isHotMail); // false



    }
}
