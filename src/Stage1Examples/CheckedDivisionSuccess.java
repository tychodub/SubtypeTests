package Stage1Examples;

public class CheckedDivisionSuccess {
    //@ subtype nonZero(int x)() = x != 0;

    public static void main(String[] args) {
        int res = division(1,1);
    }

    //@ ensures \result == x/y;
    private static int division(int x, /*@ nonZero @*/ int y) {
        return x/y;
    }
}
