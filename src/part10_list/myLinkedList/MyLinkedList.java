package part10_list.myLinkedList;

public interface MyLinkedList<E> {
    void add(int index, E e);
    void addfirst(E e);
    void addLast(E e);
    E remove(int index);
    int size();
    E[] clone();
    boolean contains(E e);
    int indexOf(E e);
    E get(int i);
    E getFirst();
    E getLast();
    void clear();
    void printList();
    E removeLast();
}
