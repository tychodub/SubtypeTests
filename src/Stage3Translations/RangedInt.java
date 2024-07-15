package Stage3Translations;

public class RangedInt {

    public static void main(String[] args) {
        int x = 23; // succeed
        //@ assert x >= -128 && x <= 127;
        x += 100; // succeed
        //@ assert x >= -128 && x <= 127;
        x /= 2; // succeed
        //@ assert x >= -128 && x <= 127;
        //x *= 3; // remove the comment indicator to make it fail
        //@ assert x >= -128 && x <= 127;
    }
}
