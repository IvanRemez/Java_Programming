package day50_JavaVersionUpdates.Java13;

public class TextBlockDemo {

    public static void main(String[] args) {

        var address = "7925 Jones Branch Drive \n " +
                "McLean,va 22102";

        System.out.println(address);

        var address2 = """
                7925 Jones Branch Dr
                McLean,VA 22102
                """;

        //      ^^ """ keeps the format of input when outputting

        System.out.println("-------------------------------------------");

        System.out.println(address2);
    }
}
