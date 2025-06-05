package AdaptedOrCopiedExamples;

public class Node {
    Object item;
    Node next;
    Node prev;
    Node(Node p, Object i, Node n) {
        prev = p;
        item = i;
        next = n;
    }
}
