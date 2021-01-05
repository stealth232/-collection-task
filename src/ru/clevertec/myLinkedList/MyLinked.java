package ru.clevertec.myLinkedList;

public interface MyLinked<E> {
    void add(E e);
    void addByIndex(int index, E e);
    int size();
    boolean remove(int index);
    E get(int index);
    void addFirst(E e);
    void addLast(E e);
    void removeFirst();
    E getFirstElem();
    E getLastElem();


}
