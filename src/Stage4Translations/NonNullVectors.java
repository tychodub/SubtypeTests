package Stage4Translations;

public class NonNullVectors {

    //@ requires xs!=null && xs.length==2;
    //@ requires Perm(xs[*],1);
    //@ ensures Perm(xs[*],1);
    private static void swap(int[] xs) {
        int left = xs[0];
        int right = xs[1];
        xs[0] = right;
        xs[1] = left;
    }

    //@ requires xs!=null && xs.length==3;
    //@ requires ys!=null && ys.length==3;
    //@ requires Perm(xs[*],1) ** Perm(ys[*],1);
    //@ ensures \result!=null && \result.length==3;
    //@ ensures Perm(xs[*],1) ** Perm(ys[*],1);
    private static int[] cross(int[] xs, int[] ys) {
        int left = xs[1]*ys[2] - xs[2]*ys[1];
        int middle = xs[2]*ys[0] - xs[0]*ys[2];
        int right = xs[0]*ys[1] - xs[1]*ys[0];
        return new int[]{left,middle,right};
    }
}
