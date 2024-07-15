package Stage1AgnosticTranslations;

public class IntegerUnderflow {
    public static void main(String[] args) {
        int z = -2147483647;
        z = z-2;
        int x = z; // rejected
        //@ assert x >= - 2147483648 && x <= 2147483647;
    }
}
