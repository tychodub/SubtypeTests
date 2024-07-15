package Stage1AgnosticTranslations;

public class AdvancedDivisionSuccess {

    public static void main(String[] args) {
        int x = 134 + 23;
        int y = ((157 - x)*2)/2+ (2 * division(2,2)) - division(2,2);
        int res = division(x,y);
    }

    //@ requires y!=0;
    //@ ensures \result == x/y;
    private static int division(int x, int y) {
        return x/y;
    }
}
