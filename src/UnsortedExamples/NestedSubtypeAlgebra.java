package UnsortedExamples;

public class NestedSubtypeAlgebra {
    //@ subtype nat(int x)() = x >= 0;
    //@ subtype negEven(int x)() = ((-x) % 2) == 0;
    //@ subtype even(subtype<int, negEven> x)() = x % 2 == 0;
    //@ subtype natOrEven(subtype<int, nat | negEven> x)() = (x % 2) == 0;
    //@ subtype evenIfNat(subtype<int, nat ==> even> x)() = true;
    //@ subtype isFour(int x)() = x == 4;
    //@ subtype fourIfNatEven(subtype<int, nat ==> even ==> isFour> x)() = true;

    public static void main(String[] args) {
        /*@ natOrEven @*/ int x = 4;
        x = -2;
        /*@ evenIfNat @*/ int y = 6;
        y = -3;
        /*@ fourIfNatEven @*/ int z = -1;
        z = 4;
        z = 6;
    }
}
