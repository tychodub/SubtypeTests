package AdaptedOrCopiedExamples;

// source: https://research.google/blog/extra-extra-read-all-about-it-nearly-all-binary-searches-and-mergesorts-are-broken/

// the overflow in binarySearch can be found by checking sub-expressions
public class BinarySearch {
    //@ subtype i32(int x)() = -2147483648 <= x && x <= 2147483647;
    //@ subtype i32Arr(int[] xs)() = (\forall int i; 0<=i && i<xs.length; -2147483648 <= xs[i] && xs[i] <= 2147483647);
    //@ subtype nonNull(int[] xs)() = xs != null;


    // one of the weird cases where ordering of requires clauses seem to matter.
    //@ requires Perm(a[*],read);
    //@ requires (\forall int i; 0<=i && i<a.length; -2147483648 <= a[i] && a[i] <= 2147483647);
    //@ requires 0 <= a.length && a.length <= 2147483647;
    public static int binarySearch(/*@ nonNull @*/ int[] a, /*@ i32 @*/  int key) {
        /*@ i32 @*/ int low = 0;
        /*@ i32 @*/ int high = a.length - 1;

        //@ loop_invariant -2147483648 <= low && low <= 2147483647;
        //@ loop_invariant -2147483648 <= high && high <= 2147483647;
        while (low <= high) {
            // the VerCors should know the below two assumptions because of the subtypes, but apparently does not infer them
            // assume -2147483648 <= low && low <= 2147483647;
            // assume -2147483648 <= high && high <= 2147483647;
            /*@ i32 @*/ int mid = (low + high) / 2;
            /*@ i32 @*/ int midVal = a[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid; // key found
            }
        }
        return -(low + 1);  // key not found.
    }
}
