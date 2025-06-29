package AdaptedOrCopiedExamples;

// the relevant paper: https://link.springer.com/article/10.1007/s10009-022-00679-7
// this is a somewhat adapted monomorphic version of the relevant code, such that VerCors can handle it

public class LinkedListExample {
    //@ resource allPerms(Node x) = (x != null) ==> (Perm(x.next, write) ** Perm(x.item, write) ** allPerms(x.next));

    transient int size = 0;
    transient Node first;
    transient Node last;

    //@ requires Perm(size, read);
    //@ ensures Perm(size, read);
    public int size() {
        return size;
    }

    //@ requires Perm(last, write);
    //@ requires Perm(last.next, write);
    //@ requires Perm(first, write);
    //@ requires Perm(size, write);
    //@ ensures Perm(last, write);
    //@ ensures Perm(last.next, write);
    //@ ensures Perm(first, write);
    //@ ensures Perm(size, write);
    public boolean add(Object e) {
        linkLast(e);
        return true;
    }

    //@ requires Perm(last, write);
    //@ requires Perm(last.next, write);
    //@ requires Perm(first, write);
    //@ requires Perm(size, write);
    //@ ensures Perm(last, write);
    //@ ensures Perm(last.next, write);
    //@ ensures Perm(first, write);
    //@ ensures Perm(size, write);
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

    //@ requires Perm(first, write);
    //@ requires allPerms(first);
    //@ ensures Perm(first, write);
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            //@ loop_invariant allPerms(x);
            for (Node x = first; x != null; x = x.next) {
                //@ unfold allPerms(x);
                if (x.item == null) {
                    return index;
                }
                index++;
            }
        } else {
            //@ loop_invariant allPerms(x);
            for (Node x = first; x != null; x = x.next) {
                //@ unfold allPerms(x);
                if (o == x.item) { // should be equals
                    return  index;
                }
                index++;
            }
        }
        return -1;
    }
}
