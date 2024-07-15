package Stage1Examples;

public class CompoundOverflow {
    //@ subtype i32(int x)() = x >= -2147483648 && x <= 2147483647;

    public static void main(String[] args) {
        int x = 2147483646;
        int y = 2147483646;
        /*@ i32 @*/ int z = (x+y)/2;
    }
}
