package Stage1AgnosticTranslations;

public class SneakyDowncastFailure {


    public static void main(String[] args) {
        short y = sneakyDowncast(60000);
    }

    //@ requires x >= -32768 && x <= 32767;
    private static short sneakyDowncast(int x) {
        return (short) x;
    }
}
