package DanhSach.myLinkedList;

public class Node {
    protected Object data;
    protected Node next;

    public Node(Object data) {
        this.data=data;
        this.next=null;
    }

    public Object getData() {
        return this.data;
    }
}
