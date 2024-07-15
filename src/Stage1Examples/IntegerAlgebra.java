package Stage1Examples;

public class IntegerAlgebra {
    //@ subtype Z2(int x)() = x==0 || x==1;

    public static void main(String[] args) {
        /*@ Z2 @*/ int left = Z2Concat(1,1);
        /*@ Z2 @*/ int right = Z2Concat(1,0);
        /*@ Z2 @*/ int middle = Z2Concat(left,right);
    }

    private static /*@ Z2 @*/ int Z2Concat(/*@ Z2 @*/ int x,/*@ Z2 @*/  int y) {
        return (x+y)%2;
    }
}
