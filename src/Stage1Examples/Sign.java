package Stage1Examples;

import java.util.ArrayList;

public class Sign {
    //@ subtype trinary(int x)() = x >= -1 && x <= 1;

    public static void main(String[] args) {
        int[] signs = {4,5,-6,0,-9,1};

        //@ loop_invariant i>=0 && i<=6;
        //@ loop_invariant (\forall* int i = 0 .. signs.length; Perm(signs[i], write));
        //@ loop_invariant (\forall int j = 0 .. i; signs[j]>=-1 && signs[j]<=1);
        for (int i=0;i<6;i++) {
            signs[i] = sign(signs[i]);
        }
        boolean isPositive = morePos(signs);
    }

    private static /*@ trinary @*/ int sign(int x) {
        /*@ trinary @*/ int res = 0;
        if (x<0) {
            res = -1;
        } else if (x>0) {
            res = 1;
        }
        return res;
    }

    //@ context_everywhere xs != null ** Perm(xs[*], write);
    //@ requires (\forall int i =0 .. xs.length ; xs[i]>=-1 && xs[i]<=1);
    private static boolean morePos(int[] xs) {
        int counter = 0;
        for (int x=0; x<xs.length;x++) {
            counter += x;
        }
        return counter>0;
    }
}
