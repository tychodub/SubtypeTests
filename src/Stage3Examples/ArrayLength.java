package Stage3Examples;

public class ArrayLength {
    //@ subtype length(int[] xs)(int l) = xs!=null && xs.length==l;

    public static void main(String[] args) {
        int[] xs = {4,2};
        swap(xs);
    }

    //@ requires Perm(xs[*],1);
    //@ ensures Perm(xs[*],1);
    private static void swap(/*@ length(2) @*/ int[] xs) {
        int left = xs[0];
        int right = xs[1];
        xs[0] = right;
        xs[1] = left;
    }
}
