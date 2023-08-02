package com.zipcodewilmington.singlylinkedlist;

public class Node<AnyType> {

    private AnyType data;
    private Node<AnyType> next;

    public Node(AnyType data, Node<AnyType> next) {
        this.data = data;
        this.next = next;
    }

    public Node(AnyType data){
       this(data, null);
    }

    public AnyType getData() { return data; }

    public Node<AnyType> getNext() {
        return this.next;
    }

    public void setNext(Node newNode) {
        this.next = newNode;
    }

    public Boolean hasNext() {
        return this.next != null;
    }


    // ...
}