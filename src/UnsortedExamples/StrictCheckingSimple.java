package UnsortedExamples;

public class StrictCheckingSimple {
    //@ subtype range(int x)(int bottom, int top) = x >= bottom && x <= top;
    //@ subtype mulId(int x)() = x == 1;
    //@ subtype nonEmpty(int[] xs)() = xs!=null && xs.length>0;

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

    //@ requires Perm(xs[*], read);
    private static int avg(/*@ nonEmpty @*/ int[] xs) {
        int result = 0;
        //@ loop_invariant 0 <= i && i <= xs.length;
        /*@ loop_invariant (\forall* int i; 0 <= i && i < xs.length;
            Perm(xs[i], read)); @*/
        for (int i=0; i<xs.length; i++) {
            result += xs[i];
        }
        return result/xs.length;
    }
}
