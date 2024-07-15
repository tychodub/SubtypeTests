package Stage2Translations;

import java.net.Socket;

public class NonNullable {

    public static void main(String[] args) {
        String text = "hello world!";
        //@ assert text!=null; // should succeed
        //@ ghost text = socketToString();
        //@ assert text!=null; // should fail
    }

    /*@ ghost
    private static String socketToString();
    @*/
}
