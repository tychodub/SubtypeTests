package Stage3Translations;

public class ArrayLength {

    public static void main(String[] args) {
        int[] xs = {4,2};
        swap(xs);
    }

    //@ requires xs!=null && xs.length==2;
    //@ requires Perm(xs[*],1);
    //@ ensures Perm(xs[*],1);
    private static void swap(int[] xs) {
        int left = xs[0];
        int right = xs[1];
        xs[0] = right;
        //@ assert xs!=null && xs.length==2;
        xs[1] = left;
        //@ assert xs!=null && xs.length==2;
    }
}
