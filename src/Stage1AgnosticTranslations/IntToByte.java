package Stage1AgnosticTranslations;

public class IntToByte {
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
        byte y = checkedDowncast(x);
        //@ assert y >= -128 && y <= 127;
    }

    //@ requires x >= -128 && x <= 127;
    //@ ensures \result >= -128 && \result <= 127;
    private static byte checkedDowncast(int x) {
        return (byte) x;
    }

    //@ requires y!=0;
    //@ ensures \result == x/y;
    private static int division(int x, int y) {
        return x/y;
    }
}
