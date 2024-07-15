package Stage1Examples;

public class AdvancedDivisionFailure {
    //@ subtype nonZero(int x)() = x != 0;

    public static void main(String[] args) {
        int x = 134 + 23;
        int y = ((157 - x)*2)/2;
        int res = division(x,y);
    }

    //@ ensures \result == x/y;
    private static int division(int x, /*@ nonZero @*/ int y) {
        return x/y;
    }
}
