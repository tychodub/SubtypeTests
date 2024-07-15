package UnsortedExamples;

public class SubtypingExample {
    //@ subtype NonZero(int x)() = x != 0;
    /*@ subtype Byte(int x)() = x >= -128
            && x <= 127; @*/
    //@ subtype NonNull(int[] x)() = x != null;
    /*@ subtype Index(int x)(int length) =
    x < length; @*/

    //@ ensures \result == x/y;
    public static int division(int x,
            /*@ NonZero @*/ int y) {
        return x/y;
    }

    public static void main(String[] args) {
               /*@ Byte @*/ int result = division(3,5);
               /*@ NonNull @*/ int[] array = new int[4];
               /*@ Index(4) @*/ int index = 3;
        array[index] = result;
    }
}