package Stage1Examples;

public class SneakyDowncastFailure {
    //@ subtype i16(short x)() = x >= -32768 && x <= 32767;


    public static void main(String[] args) {
        short y = sneakyDowncast(60000);
    }

    private static short sneakyDowncast(/*@ i16 @*/ int x) {
        return (short) x;
    }
}
