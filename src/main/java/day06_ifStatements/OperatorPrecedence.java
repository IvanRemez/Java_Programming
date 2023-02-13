package day06_ifStatements;

public class OperatorPrecedence {

    public static void main(String[] args) {

        System.out.println(5 + 2 * 3); // multiplication first = 11
        //                   5 + 6 = 11
        System.out.println((5 + 2) * 3); // parenthesis first = 21
        //                     7 * 3 = 21
        System.out.println(7 + 3 - 2 / 2); // 9
        //                     10 - 1 = 9
        System.out.println(-5 + 3); // unary (-) first = -2
        //                  -5 + 3 = -2
        System.out.println(10 > 9 == 8 < 7 && "Java" == "Python" || 'a' == 'A');
        //                  true == false  &&  "Java" == "Python" || 'a' == 'A'
        //                      false      &&       false       ||    false
        //                              false     ||   false
        //                                      false

        System.out.println(100 >= 20 && 40 * 2 > 60); // multiplication first
        //                  100 >= 20 && 80 > 60 (same order)
        //                      true && true
        //                          true

        int a = 20;

        a += 10 + 2 * 3; // multiplication first
        // a += 10 + 6 addition first
        // a += 16 last is increment
        // a = 36
        System.out.println(a);

    }
}
