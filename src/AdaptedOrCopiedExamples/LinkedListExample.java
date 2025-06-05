package AdaptedOrCopiedExamples;

// the relevant paper: https://link.springer.com/article/10.1007/s10009-022-00679-7
// this is a somewhat adapted monomorphic version of the relevant code, such that VerCors can handle it

public class LinkedListExample {
    //@ subtype i32(int x)() = -2147483648 <= x && x <= 2147483647;

    transient int size = 0;
    transient Node first;
    transient Node last;

    public /*@ i32 @*/ int size() {
        return size;
    }

    public boolean add(Object e) {
        linkLast(e);
        return true;
    }

    void linkLast(Object e) {
        final Node l = last;
        final Node newNode = new Node(l, e, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node x = first; x != null; x = x.next) {
                if (x.item == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (o.equals(x.item)) {
                    return  index;
                }
                index++;
            }
        }
        return -1;
    }
}
