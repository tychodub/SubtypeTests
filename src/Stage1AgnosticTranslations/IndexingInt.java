package Stage1AgnosticTranslations;

public class IndexingInt {

    public static void main(String[] args) {
        int[] notString = {1,2,3,4};
        //@ loop_invariant Perm(notString[*],1);
        //@ loop_invariant i>=0 && i<=4;
        for (int i=0;i<notString.length;i++) // how can we make this more interesting?
        {
            notString[i] = notString[i];
        }
    }
}
