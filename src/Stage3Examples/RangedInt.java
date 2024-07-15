package Stage3Examples;

public class RangedInt {
    //@ subtype range(int x)(int bottom, int top) = x >= bottom && x <= top;

    public static void main(String[] args) {
        /*@ range(-128,127) @*/ int x = 23;
        x += 100;
        x /= 2;
        //x = x * 3; // remove the comment indicator to make it fail
    }
}
