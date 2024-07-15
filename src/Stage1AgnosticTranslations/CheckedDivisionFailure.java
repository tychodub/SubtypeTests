package Stage1AgnosticTranslations;

public class CheckedDivisionFailure {


    public static void main(String[] args) {
        int res = division(1,0); // precondition will fail
    }

    //@ requires y!=0;
    private static int division(int x, int y) {
        return x/y;
    }
}
