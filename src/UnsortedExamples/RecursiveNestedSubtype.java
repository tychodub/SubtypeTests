package UnsortedExamples;

// recursive definitions like this are not supported, this example exists to test that it does not crash VerCors
public class RecursiveNestedSubtype {
    //@ subtype natEven(subtype<int, natEven> x)() = (x % 2) == 0;

    public static void main(String[] args) {
        /*@ natEven @*/ int x = 2;
        x = 3;
    }
}
