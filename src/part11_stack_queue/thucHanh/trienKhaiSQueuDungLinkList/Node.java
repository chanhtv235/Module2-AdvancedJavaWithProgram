package part11_stack_queue.thucHanh.trienKhaiSQueuDungLinkList;

public class Node {
    public int key;
    public Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }

    public String toString() {
        return "key: "+key+
                "\n next:  "+ next;
    }

//    public static void main(String[] args) {
//        Node temp =new Node(123);
////        System.out.println(temp.toString());
////        System.out.println(temp.next);
//    }
}
