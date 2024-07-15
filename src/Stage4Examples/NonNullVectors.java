package Stage4Examples;

public class NonNullVectors {
    //@ subtype nonNull(int[] xs)() = xs!=null;
    //@ subtype len2(int[] xs)() = xs.length==2;
    //@ subtype len3(int[] xs)() = xs.length==3;

    //@ requires Perm(xs[*],1);
    //@ ensures Perm(xs[*],1);
    private static void swap(/*@ nonNull len2 @*/ int[] xs) {
        int left = xs[0];
        int right = xs[1];
        xs[0] = right;
        xs[1] = left;
    }

    //@ requires Perm(xs[*],1) ** Perm(ys[*],1);
    //@ ensures Perm(xs[*],1) ** Perm(ys[*],1);
    private static /*@ nonNull len3 @*/ int[] cross(/*@ nonNull len3 @*/ int[] xs,/*@ nonNull len3 @*/ int[] ys) {
        int left = xs[1]*ys[2] - xs[2]*ys[1];
        int middle = xs[2]*ys[0] - xs[0]*ys[2];
        int right = xs[0]*ys[1] - xs[1]*ys[0];
        return new int[]{left,middle,right};
    }
}
