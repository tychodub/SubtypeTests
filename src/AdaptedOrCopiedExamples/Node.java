package AdaptedOrCopiedExamples;

public class Node {
    Object item;
    Node next;
    Node prev;

    //@ ensures Perm(prev, write);
    //@ ensures Perm(item, write);
    //@ ensures Perm(next, write);
    Node(Node p, Object i, Node n) {
        prev = p;
        item = i;
        next = n;
    }
}
