package Stage1AgnosticTranslations;

public class IntegerAlgebra {

    public static void main(String[] args) {
        int left = Z2Concat(1,1);
        //@ assert left==0 || left==1;
        int right = Z2Concat(1,0);
        //@ assert right==0 || right==1;
        int middle = Z2Concat(left,right);
        //@ assert right==0 || right==1;
    }

    //@ requires x==0 || x==1;
    //@ requires y==0 || y==1;
    //@ ensures \result==0 || \result==1;
    private static int Z2Concat(int x, int y) {
        return (x+y)%2;
    }
}
