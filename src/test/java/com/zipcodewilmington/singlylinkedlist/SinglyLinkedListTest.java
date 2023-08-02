package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {


    @Test
    public void constructorTest() {
        SinglyLinkedList<Integer> linkList = new SinglyLinkedList<>();
        Assert.assertNotNull(linkList);
    }


    @Test
    public void isEmptyTest(){
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        Assert.assertTrue(linkedList.isEmpty());
    }
    @Test
    public void addTest1() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(1);
        Assert.assertFalse(linkedList.isEmpty());
    }

    @Test
    public void addTest2() {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        Assert.assertFalse(linkedList.isEmpty());
    }

    @Test
    public void removeTest() {
    }

    @Test
    public void toStringEmptyTest(){
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        String expected = "head -> NULL";
        String actual = linkedList.toString();

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void toStringOneTest(){
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(1);
        String expected = "head -> [1] -> NULL";
        String actual = linkedList.toString();

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void toStringTwoTest(){
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        String expected = "head -> [1] -> [2] -> NULL";
        String actual = linkedList.toString();

        Assert.assertEquals(expected, actual);

    }
    @Test
    public void sizeTest0(){
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        Integer expected = 0;

        Integer actual = linkedList.size();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void sizeTest1(){
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        Integer expected = 1;
        linkedList.add(1);

        Integer actual = linkedList.size();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void sizeTest2(){
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        Integer expected = 2;
        linkedList.add(1);
        linkedList.add(2);

        Integer actual = linkedList.size();

        Assert.assertEquals(expected, actual);
    }

}