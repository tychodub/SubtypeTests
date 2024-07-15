package Stage1AgnosticTranslations;

public class CheckedDivisionSuccess {


    public static void main(String[] args) {
        int res = division(1,1);
    }

    //@ requires y!=0;
    //@ ensures \result == x/y;
    private static int division(int x, int y) {
        return x/y;
    }
}
