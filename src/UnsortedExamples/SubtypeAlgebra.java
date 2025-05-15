package UnsortedExamples;

public class SubtypeAlgebra {
    //@ subtype nat(int x)() = x >= 0;
    //@ subtype nullish(int[] x)() = x == null;
    //@ subtype nonNull(int[] xs)() = xs!=null;
    //@ subtype length(int[] xs)(int l) = xs!=null && xs.length==l;
    //@ subtype negOrZero(int x)() = x <= 0;

    public static void main(String[] args) {
        /*@ nullish | length(10) | nonNull ==> length(3) @*/ int[] arr = null;
        arr = new int[10];
        arr = new int[3];
        /*@ nat !(negOrZero) @*/ int x = 1;
        x = 0;
    }
}
