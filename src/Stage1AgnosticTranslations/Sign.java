package Stage1AgnosticTranslations;

public class Sign {

    public static void main(String[] args) {
        int[] signs = {4,5,-6,0,-9,1};

        //@ loop_invariant i>=0 && i<=6;
        //@ loop_invariant (\forall* int i = 0 .. signs.length; Perm(signs[i], write));
        //@ loop_invariant (\forall int j = 0 .. i; signs[j]>=-1 && signs[j]<=1);
        for (int i = 0; i < signs.length; i++) {
            signs[i] = sign(signs[i]);
        }
        boolean isPositive = morePos(signs);
    }

    //@ ensures \result >= -1 && \result <= 1;
    private static int sign(int x) {
        int res = 0;
        //@ assert res >= -1 && res <= 1;
        if (x<0) {
            res = -1;
            //@ assert res >= -1 && res <= 1;
        } else if (x>0) {
            res = 1;
            //@ assert res >= -1 && res <= 1;
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
