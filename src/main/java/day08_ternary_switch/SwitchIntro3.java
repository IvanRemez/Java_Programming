package day08_ternary_switch;

public class SwitchIntro3 {

    public static void main(String[] args) {

        int score = 95;
        String result = "Your grade is: ";

        if (score >= 90) { // false = score < 90
            result += "A";
        } else if (score >= 80) { //&& score < 90 no need to add because the previous condition already negates this
            result += "B";
        } else if (score >= 70) {
            result += "C";
        } else if (score >= 60) {
            result += "D";
        } else {
            result += "F";
        }
        System.out.println(result);

        // would need to create 100 BLOCKS using Switch
        // Switch only uses the == operator
    }
}
