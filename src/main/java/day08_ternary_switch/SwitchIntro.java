package day08_ternary_switch;

public class SwitchIntro {

    public static void main(String[] args) {

        /*
        A: Excellent
        B: Great Job
        C: Good
        D: Passed
        F: Failed
         */

        char grade = 'A';
        String result = "";

        if (grade == 'A') {
            result = "Excellent";
        } else if (grade == 'B') {
            result = "Great job";
        } else if (grade == 'C') {
            result = "Good";
        } else if (grade == 'D') {
            result = "Passed";
        } else if (grade == 'F') {
            result = "Failed";
        } else {
            result = "Invalid";
        }

        System.out.println(result);
        System.out.println("----------------------------------");

        switch (grade) {

            case 'A':
                System.out.println("Excellent");
                break; // this closes the case
            case 'B':
                System.out.println("Great Job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid");
                // no need for break if switch statement is finished
        }

    }
}
