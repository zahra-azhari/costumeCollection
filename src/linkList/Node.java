package linkList;

public class Node {
    private int value;
    private Node next ;
    private Node prev ;


    public Node() {
    }

    public Node(int value, Node next, Node prev, Node head, Node tail) {
        this.value = value;
        this.next = next;
        this.prev = prev;
//        this.head = head;
//        this.tail = tail;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

//    public Node getHead() {
//        return head;
//    }
//
//    public void setHead(Node head) {
//        this.head = head;
//    }
//
//    public Node getTail() {
//        return tail;
//    }
//
//    public void setTail(Node tail) {
//        this.tail = tail;
//    }
}
