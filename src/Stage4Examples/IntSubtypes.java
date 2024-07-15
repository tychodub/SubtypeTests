package Stage4Examples;

public class IntSubtypes {
    //@ subtype Nat(int x)() = x >= 0;
    //@ subtype Odd(int x)() = x%2==1;
    //@ subtype Even(int x)() = x%2==0;

    public static void main(String[] args) {
        int z = weirdDivision(35, 66);
    }

    //@ ensures \result == 1;
    private static int weirdDivision(/*@ Nat Odd @*/ int x, /*@ Nat Even @*/ int y) {
        return -(y-x)/(x-y);
    }
}
