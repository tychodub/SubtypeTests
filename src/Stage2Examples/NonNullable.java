package Stage2Examples;

import java.net.Socket;

public class NonNullable {
    //@ subtype nonNull(Object text)() = text!=null;

    public static void main(String[] args) {
        /*@ nonNull @*/ String text = "hello world!";
        //@ ghost text = socketToString();
    }

    /*@ ghost
    private static subtype<String, nonNull> socketToString();
    @*/
}
