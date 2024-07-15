package Stage1Examples;

public class CheckedLogarithm {
    //@ subtype nonNeg(int x)() = x >= 0;

    public static void main(String[] args) {
        //@ ghost logarithm(3);
        //@ ghost logarithm(-1);
    }

    /*@
    ghost
    private static double logarithm(nonNeg int x);
    @*/
}
