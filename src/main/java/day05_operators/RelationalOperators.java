package day05_operators;

public class RelationalOperators {

    public static void main(String[] args) {

        int a = 1000;
        int b = 200;

        System.out.println(a > b); // true
        System.out.println(b < b); // false

        boolean aIsGreater = a > b;
        System.out.println(aIsGreater);
        System.out.println("------------------------------------");

        int score = 75;
        boolean passed = score >= 60;
        System.out.println(passed); // 75 > 60 = true

        int age = 21;
        boolean eligible = age >= 21;
        System.out.println(eligible); // 21 = 21 = true
        boolean eligible2 = age > 21;
        System.out.println(eligible2); // 21 not > 21 = false

        boolean eligibleToVote = age >= 18;
        System.out.println(eligibleToVote); // 21 > 18 = true
        System.out.println("------------------------------------");

        System.out.println(100 > 100); // false
        System.out.println(100 >= 100); // true
        System.out.println(100 >= 185); // false
        System.out.println("------------------------------------");

        score = 48;
        boolean failed = score < 60;
        System.out.println(failed); // 48 < 60 = true
        System.out.println("------------------------------------");

        System.out.println(100 < 2000); // true
        System.out.println(100 < 20); // false
        System.out.println(95 <= 100);
        System.out.println(100 <= 100);
        System.out.println(10 <= 5);
        System.out.println("------------------------------------");

        System.out.println('a' > 'b');
        //                 65 > 66 = false
        // System.out.println("Java"<= "C#");
        // >, <, >=, <= only for #s


    }
}
