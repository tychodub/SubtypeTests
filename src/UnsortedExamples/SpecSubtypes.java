package UnsortedExamples;

public class SpecSubtypes {
    //@ subtype even(int x)() = x%2 == 0;
    //@ subtype nat(int x)() = x >= 0;

    public static void main(String[] args) {
        //@ ghost subtype<int, even nat> x = 2;
        //@ ghost subtype<int, even nat> y = -2;
        /*@ even nat @*/ int z = 1;
    }
}
