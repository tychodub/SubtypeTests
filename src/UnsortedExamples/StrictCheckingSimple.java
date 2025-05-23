package UnsortedExamples;

public class StrictCheckingSimple {
    //@ subtype range(int x)(int bottom, int top) = x >= bottom && x <= top;

    public static void main(String[] args) {
        /*@ range(0, 128) @*/ int x = (128+2)-2;
        x = (x+2)-2;
    }
}
