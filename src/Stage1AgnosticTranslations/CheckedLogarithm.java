package Stage1AgnosticTranslations;

public class CheckedLogarithm {

    public static void main(String[] args) {
        //@ ghost logarithm(3); // should pass
        //@ ghost logarithm(-1); // should get rejected
    }

    /*@
    ghost
    requires x >= 0;
    private static double logarithm(int x);
    @*/
}
