package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

public interface SinglyLinkedListInterface <AnyType> {

    public void add(AnyType data);

    public void remove(int index) throws IndexOutOfBoundsException;

    public boolean contains(AnyType data);

    public int find(AnyType data);

    public int size();

    public AnyType get(int index) throws IndexOutOfBoundsException;

    public SinglyLinkedList<AnyType> copy();

    public void sort(Comparator<AnyType> comparator);
}
