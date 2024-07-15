package Stage1Examples;

public class IntegerUnderflow {
    //@ subtype i32(int x)() = x >= -2147483648 && x <= 2147483647;

    public static void main(String[] args) {
        int z = -2147483647;
        z = z-2;
        /*@ i32 @*/ int x = z;
    }
}
