package Stage4Translations;

public class IntSubtypes {

    public static void main(String[] args) {
        int z = weirdDivision(35, 66);
    }

    //@ requires x >=0 && x%2==1;
    //@ requires y >=0 && y%2==0;
    //@ ensures \result == 1;
    private static int weirdDivision(int x, int y) {
        return -(y-x)/(x-y);
    }
}
