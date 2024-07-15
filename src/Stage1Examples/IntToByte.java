package Stage1Examples;

public class IntToByte {
    //@ subtype i8(byte x)() = x >= -128 && x <= 127;
    //@ subtype nonZero(int x)() = x != 0;

    /*@
    ghost
    ensures \result >= -2147483648 && \result <=  2147483647;
    public static int generateRandomInt();
    @*/

    public static void main(String[] args) {
        int x = 1200000;
        //@ ghost x = generateRandomInt();
        x = division(x,8192); // divide by 2 to the power 13
        x = division(x,8192); // divide by 2 to the power 13 again
        /*@ i8 @*/ byte y = sneakyDowncast(x);
    }

    //@ ensures \result >= -128 && \result <= 127;
    private static byte sneakyDowncast(/*@ i8 @*/ int x) {
        return (byte) x;
    }

    //@ ensures \result == x/y;
    private static int division(int x, /*@ nonZero @*/  int y) {
        return x/y;
    }
}
