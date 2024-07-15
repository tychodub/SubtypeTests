package Stage1CompoundTranslations;

public class CompoundOverflow {
    public static void main(String[] args) {
        int x = 2147483646;
        int y = 2147483646;
        int z = (x+y)/2;
        //@ assert z >= - 2147483648 && z <= 2147483647;
    }
}
