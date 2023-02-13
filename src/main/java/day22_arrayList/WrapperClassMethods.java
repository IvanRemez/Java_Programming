package day22_arrayList;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "20";

        System.out.println(str + 1); // String + 1 = concatenation = 201

        // Integer num1 = Integer.parseInt(str);

        int num = Integer.parseInt(str);
        // converts "20" string to 20 int and reassigns to variable num

        System.out.println(num + 1); // int prim + 1 = addition = 21

        Integer num2 = Integer.valueOf(str);
        // converts str to int and wraps in Integer class as an object which can be used
        // in data structures

        System.out.println(num2);
        System.out.println("--------------------------------------------");

        String s = "20.5";

        double num3 = Double.parseDouble(s);
        // converts String to double prim

        Double num4 = Double.valueOf(s);
        // converts String to double and wraps in Double class

        System.out.println(num3);
        System.out.println(num4);
        System.out.println("--------------------------------------------");

        String x = "true";

        boolean r1 = Boolean.parseBoolean(x);
        // converts String to boolean prim

        Boolean r2 = Boolean.valueOf(x);
        // converts String to boolean and wraps in Boolean class

        System.out.println(r1);
        System.out.println(r2);
        System.out.println("--------------------------------------------");

        char ch = 'A';

        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isSpecialChar = !Character.isLetterOrDigit(ch);
        // if char is neither letter nor digit it must be special char
        
        boolean isLowerCaseLetter = Character.isLowerCase(ch);
        boolean isUpperCaseLetter = Character.isUpperCase(ch);

        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter);
        System.out.println("isUpperCaseLetter = " + isUpperCaseLetter);
        System.out.println("--------------------------------------------");

        String string = "a1b2c3d4e5";
        
        int sum = 0;

        for (char each : string.toCharArray()) {

            if (Character.isDigit(each)){ // if char is a digit

                sum += Integer.parseInt(each + ""); // convert it to int prim
            }
        } // allows you to add up all the digits from the string
        System.out.println("sum = " + sum);
    }
}
