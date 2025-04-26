package UnsortedExamples;

public class NestedSubtypes {
    //@ subtype nat(int x)() = x >= 0;
    //@ subtype oneHand(int y)() = y <= 10;
    //@ subtype natEven(subtype<int, nat> x)() = (x % 2) == 0;
    //@ subtype thirdLayer(subtype<int, natEven oneHand> y)() = (y == 4) || (y == 8);

    public static void main(String[] args) {
        /*@ natEven @*/ int x = 2;
        x = -2;
        x = 3;
    }
}
