package Stage3Examples;

public class UnsignedBoundInt {
    //@ subtype Z(int x)(int top) = x >= 0 && x < top;
    //@ subtype index(int x)(int length) = x >= 0 && x <= length;

    public static void main(String[] args) {
        /*@ Z(2) @*/ int x = 0;
        x += 1;
        x *= 1*0;
        x += 1;
        x = 0;
        int[] ys = {1,0,1,0,1};
        //@ loop_invariant Perm(ys[*],1);
        for (/*@ index(ys.length) @*/ int i=0;i<ys.length;i++) {
            x += ys[i];
        }
    }
}
