package day07_IfStatements;

public class MonthName {

    public static void main(String[] args) {

        int n = 12;
        String month = "";

        if (n >= 1 && n <= 12) { // 12 possible outcomes

            if (n == 1) System.out.println("January");
            else if (n == 2) System.out.println("February");
            else if (n == 3) System.out.println("March");
            else if (n == 4) System.out.println("April");
            else if (n == 5) System.out.println("May");
            else if (n == 6) System.out.println("June");
            else if (n == 7) System.out.println("July");
            else if (n == 8) System.out.println("August");
            else if (n == 9) System.out.println("September");
            else if (n == 10) System.out.println("October");
            else if (n == 11) System.out.println("November");
            else month = "December";

        }else {
            month = "No such month";
        }
        System.out.println(month);
    }
}
