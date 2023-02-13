package day11_string2;

public class StringMethods2 {

    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";

        sentence = sentence.replace("Python", "Java");
        System.out.println(sentence);
        System.out.println("-----------------------------------");

        String word = "java";

        word = word.replace('a', 'e'); // jeve
        // word = word.replace("a", "e"); // can use both '' and ""

        System.out.println(word);
        System.out.println("-----------------------------------");

        String sentence2 = "I love Java, Java is cool";

        // sentence2 = sentence2.replace("Java", "Python");
        // System.out.println(sentence2); // ALL "Java" replaced by "Python"

        sentence2 = sentence2.replaceFirst("Java", "Python");

        System.out.println(sentence2); // "I love Python, Java is cool"

        String sentence3 = "Java is fun, Java is cool, Java is amazing";

        // sentence3 = sentence3.replace("Java", "Python");
        sentence3 = sentence3.replaceFirst(", Java", ", Python");
        // adding ", " in front of Java overlooks the first "Java is fun" and
        // replaces the second Java which contains ", " in front of it
        // when using this trick make sure to add the ", " to your replacement string

        System.out.println(sentence3);
        System.out.println("-----------------------------------");

        String sentence4 = "I love Java Programming";

        String languageName = sentence4.substring(7, 10 + 1);
              // ending index excluded so need to add 1 ^^

        System.out.println(languageName);
        System.out.println("-----------------------------------");

        String sentence5 = "Today is Sunday, Tomorrow is Monday";
        //    index =       0123456789    14

        String today = sentence5.substring(9, 14 + 1);
        System.out.println(today);
        System.out.println("-----------------------------------");

        String email = "CydeoSchoolJavaProgramming@gmail.com";

        int beginning = email.indexOf('@') + 1;
        int ending = email.lastIndexOf('.');
            // lastIndex excludes the last index # so no need to subtract 1

        String domain = email.substring(beginning, ending);
        System.out.println(domain);
        System.out.println("-----------------------------------");

        String sentence6 = "I love Java programming";
        String r1 = sentence6.substring(7);

        System.out.println(r1);

        String sentence7 = "Today is Sunday, Tomorrow is Monday";

        String tomorrow = sentence7.substring(sentence7.lastIndexOf(' ') + 1);

        System.out.println(tomorrow);

        String sentence8 = "I study at Cydeo School";

        String schoolName = sentence8.substring(11);
        System.out.println(schoolName);
        System.out.println("-----------------------------------");

        String str = "Python";
        String result = (str+"\n").repeat(10);
        System.out.println(result);

    }
}
