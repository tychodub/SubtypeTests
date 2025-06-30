package UnsortedExamples;

/*@
pure boolean validate(String str) = false;
 @*/

public class ValidatedRawSQL {
    //@ subtype isNull(String s)() = s == null;
    //@ subtype validSQL(String s)() = validate(s);

    private static /*@ !isNull ==> validSQL @*/ String validOrNull(String rawStr) {
        //@ assume (rawStr != null) ==> validate(rawStr);
        return rawStr; // body not relevant
    }

    private static void executeSQL(/*@ validSQL @*/ String sqlStr) {
        // insert some database update logic here
    }

    public static void main(String[] args) {
        DefaultInputReader reader = new DefaultInputReader();
        String message1 = reader.getMessage();
        String message2 = reader.getMessage();
        String message3 = reader.getMessage();
        String message4 = reader.getMessage();
        String message5 = reader.getMessage();
        String message6 = reader.getMessage();
        message1 = validOrNull(message1);
        message2 = validOrNull(message2);
        message3 = validOrNull(message3);
        message4 = validOrNull(message4);
        message5 = validOrNull(message5);
        if (message1 != null) {
            executeSQL(message1);
        }
        if (message2 != null) {
            executeSQL(message2);
        }
        if (message3 != null) {
            executeSQL(message3);
        }
        if (message4 != null) {
            executeSQL(message4);
        }
        if (message5 != null) {
            executeSQL(message5);
        }
        if (message6 != null) {
            executeSQL(message6);
        }
    }
}
