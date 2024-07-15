package Stage3Translations;

public class UnsignedBoundInt {

    public static void main(String[] args) {
        int x = 0;
        //@ assert x >= 0 && x < 2;
        x += 1;
        //@ assert x >= 0 && x < 2;
        x *= 1*0;
        //@ assert x >= 0 && x < 2;
        x += 1;
        //@ assert x >= 0 && x < 2;
        x = 0;
        //@ assert x >= 0 && x < 2;
        int[] ys = {1,0,1,0,1};
        //@ loop_invariant i >= 0 && i <= ys.length;
        //@ loop_invariant Perm(ys[*],1);
        for (int i=0;i<ys.length;i++) {
            x += ys[i];
        }
    }
}
