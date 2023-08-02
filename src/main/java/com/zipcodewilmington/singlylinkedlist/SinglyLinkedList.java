package com.zipcodewilmington.singlylinkedlist;

import java.util.Comparator;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList<AnyType> implements SinglyLinkedListInterface {
    private Node<AnyType> head = null;

    public SinglyLinkedList() {
    }

    @Override
    public void add(Object data) {

        Node newNode = new Node(data);
        if (this.head == null){
            this.head = newNode;
        } else {
            Node<AnyType> temp = head;
            while (temp.hasNext()){
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }

    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {

    }

    @Override
    public boolean contains(Object data) {
        return this.find(data) != -1;
    }

    @Override
    public int find(Object data) {
        int result = -1;
        if (this.isEmpty()){
            return result;
        }
        Node<AnyType> temp = this.head;
        do{
            result++;
            if (temp.getData().equals(data)){
                return result;
            }
            temp = temp.getNext();
        } while (temp != null);


        return -1;
    }

    @Override
    public int size() {
        if (this.isEmpty()){
            return 0;
        }
        Node<AnyType> temp = this.head;
        Integer result = 0;
            do{
               result++;
               temp = temp.getNext();
            } while (temp != null);

        return result;
    }

    @Override
    public AnyType get(int index) throws IndexOutOfBoundsException {
        int result = -1;
        if (this.isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        Node<AnyType> temp = this.head;
        do{
            result++;
            if (result == index){
                return temp.getData();
            }
            temp = temp.getNext();
        } while (temp != null);


        return (AnyType) new IndexOutOfBoundsException();
    }

    @Override
    public SinglyLinkedList copy() {
        return null;
    }

    @Override
    public void sort(Comparator comparator) {

    }

    public Boolean isEmpty(){
        return head == null;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();

        string.append("head -> ");

        Node<AnyType> temp = this.head;
        if (!this.isEmpty()){
        do{
            string.append("[")
                    .append(temp.getData())
                    .append("] -> ");
            temp = temp.getNext();

        } while (temp != null);
        }


        string.append("NULL");

        return string.toString();

    }
}
