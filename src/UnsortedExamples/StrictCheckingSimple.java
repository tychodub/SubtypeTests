package UnsortedExamples;

public class StrictCheckingSimple {
    //@ subtype range(int x)(int bottom, int top) = x >= bottom && x <= top;
    //@ subtype mulId(int x)() = x == 1;

    public static void main(String[] args) {
        /*@ strict range(0, 128) @*/ int x = (128+2)-2;
        x = (x-2)+2;
        int y = 2147483647;
        addOne(y);
        x = (x+multiplicativeIdentity())-2;
    }

    private static /*@ mulId @*/ int multiplicativeIdentity() {
        return 1;
    }

    private static int addOne(int y) {
        return y+1;
    }
}
