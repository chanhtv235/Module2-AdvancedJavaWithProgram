package DanhSach.myLinkedList;

public class MyLinkedListImpl<E> implements MyLinkedList {
    Node head;
    private static int numNodes = 0;

    public MyLinkedListImpl() {
    }

    @Override
    public void add(int index, Object o) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        } else if (index == 0) {
            Node temp = new Node(o);
            temp.next = head;
            head = temp;
            this.numNodes++;
        } else {
            Node temp = head;
            Node holder;
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(o);
            temp.next.next = holder;
            this.numNodes++;
        }

    }

    @Override
    public void addfirst(Object o) {
        Node temp = new Node(o);
        temp.next = head;
        head = temp;
        this.numNodes++;
    }

    @Override
    public void addLast(Object o) {
        Node temp = head;
        Node newNode = new Node(o);
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        this.numNodes++;
    }

    @Override
    public Object remove(int index) {
        Node temp = head;
        Node newNode;
        if (index < 0 || index >= this.numNodes) {
            return null;
        } else if (index == 0) {
            newNode = head;
            head = head.next;
            this.numNodes--;
            return newNode.data;
        }
        for (int i = 1; i < this.numNodes; i++) {
            if (i == index) {
                newNode = temp.next;
                temp.next = temp.next.next;
                this.numNodes--;
                return newNode.data;
            } else {
                temp = temp.next;
            }
        }
        this.numNodes--;
        return temp.next.data;
    }

    @Override
    public int size() {
        return this.numNodes;
    }

    @Override
    public Object[] clone() {
        Object[] objects = new Object[this.numNodes];
        Node temp = head;
        for (int i = 0; i < this.numNodes; i++) {
            objects[i] = temp.data;
            temp = temp.next;
        }
        return objects;
    }

    @Override
    public boolean contains(Object o) {
        for (Node temp = head; temp.next != null; temp = temp.next) {
            if (temp.data == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Object o) {
        Node temp = head;
        for (int i = 0; i < this.numNodes; i++) {
            if (temp.data == o) {
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }

    @Override
    public Object get(int i) {
        Node temp = head;
        for (int j = 0; j < this.numNodes; j++) {
            if (i == j) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    @Override
    public Object getFirst() {
        return head.data;
    }

    @Override
    public Object getLast() {
        Node temp;
        for (temp = head; temp.next != null; temp = temp.next) {
        }
        return temp.data;
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.numNodes; i++) {
            remove(i);
        }
    }

    @Override
    public void printList() {
        for (int i = 0; i < numNodes; i++) {
            System.out.println("object[" + i + "] :" + get(i));
        }
    }

    @Override
    public Object removeLast() {
        Object newNode = remove(this.numNodes - 1);
        return newNode;
    }

    public static void main(String[] args) {
        MyLinkedListImpl<Integer> myLinkedListTest = new MyLinkedListImpl<Integer>();
        myLinkedListTest.add(0, 5);
        myLinkedListTest.addfirst(2);
        myLinkedListTest.addLast(3);
        myLinkedListTest.add(2, 4);
        myLinkedListTest.printList();
        System.out.println(myLinkedListTest.remove(3));
        myLinkedListTest.printList();
        System.out.println("NumNodes is :" + myLinkedListTest.size());
        //System.out.println(myLinkedListTest.getFirst());
        //System.out.println(myLinkedListTest.getLast());
        //System.out.println(myLinkedListTest.indexOf(5));
        Object newNode = myLinkedListTest.removeLast();
        System.out.println(newNode);
        /*Object[] newObject = new Object[numNodes];
        newObject = myLinkedListTest.clone();
        for (int i = 0; i < numNodes; i++) {
            System.out.println(newObject[i]);
        }
        */
        System.out.println("NumNodes is :" + myLinkedListTest.size());
        myLinkedListTest.printList();
    }
}

