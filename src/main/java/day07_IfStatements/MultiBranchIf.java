package day07_IfStatements;

public class MultiBranchIf {

    public static void main(String[] args) {

        int num = 100;
        String result = "";

        if (num > 0) {
            result = "Positive";
        } else if (num < 0) {
            result = "Negative";
        } else {
            result = "Zero";
        }
        System.out.println(result);

    }
}
