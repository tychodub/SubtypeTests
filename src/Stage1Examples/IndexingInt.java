package Stage1Examples;

public class IndexingInt {
    //@ subtype indexer4(int x)() = x>=0 && x<=4;
    // subtype includes 4 because post-condition

    public static void main(String[] args) {
        int[] notString = {1,2,3,4};
        //@ loop_invariant Perm(notString[*],1);
        for (/*@ indexer4 @*/ int i=0;i<notString.length;i++) {
            notString[i] = notString[(i+1)%4];
        }
    }
}
