package by.ed.hvozdzeu.collection;

public interface ISimplyLinkedList<E> {

    boolean add(E e);

    void addLast(E e);

    void addFirst(E e);

    int size();

    E getElementByIndex(int index);

    E getElementByContains(E e);

    void remove();

    void removeById();

    void removeByContains(E e);

}
