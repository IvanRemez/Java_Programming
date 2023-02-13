package day38_Exceptions2;

public class BreakTimeException extends RuntimeException{

    // Default Constructor:
    public BreakTimeException(){
        super("It's break time");
    }

    // 2nd Constructor with String parameter:

    public BreakTimeException(String message){
        super(message);
    }


}
