package Stage3Examples;

public class UnsignedBoundInt {
    //@ subtype Z(int x)(int top) = x >= 0 && x < top;
    //@ subtype index(int x)(int length) = x >= 0 && x <= length;
    //@ subtype allZero(int[] xs)() = (\forall int i; 0<=i && i<xs.length; xs[i]==0);

    public static void main(String[] args) {
        /*@ Z(2) @*/ int x = 0;
        x += 1;
        x *= 1*0;
        x += 1;
        x = 0;

        /*@ allZero @*/ int[] ys = {0,0,0};


        // the below loop invariant is not enough to prove that "x += ys[i]" is valid
        // something more powerful is needed, for now the @ has been left out so it can serve as purely a comment
        // loop_invariant (\forall int i1; 0 <= i1 && i1 < ys.length ==> ys[i1] == 0);

        //@ loop_invariant Perm(ys[*],1);
        //@ loop_invariant i>=0 && i<ys.length;
        for (int i=0;i<ys.length;i++) {
            x += ys[i];
        }
    }
}
