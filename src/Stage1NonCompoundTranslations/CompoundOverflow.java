package Stage1NonCompoundTranslations;

public class CompoundOverflow {
    public static void main(String[] args) {
        int x = 2147483646;
        int y = 2147483646;
        int z = x+y; // assert wil fail
        //@ assert z >= - 2147483648 && z <= 2147483647;
        z = z/2;
        //@ assert z >= - 2147483648 && z <= 2147483647;
    }
}
