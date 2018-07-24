import java.util.*;

import java.io.*;

// This is a simple implementation of Singly Linked List
public class listinsert {
    node head;

    public static class node {
        int data;
        node next;

        node(int d) {
            this.data = d;
            this.next = null;
        }

    }

    public static void traverse(node head) {
        node currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + " ");
            currnode = currnode.next;

        }
    }

    public static void reverse(node head) {
        node currnode = head;
        node prev = null;
        node next1;

        while (currnode != null) {
            next1 = currnode.next;
            currnode.next = prev;
            prev = currnode;
            currnode = next1;
        }
        head = prev;
        currnode = head;
        while (currnode != null) {
            System.out.print(currnode.data + " ");
            currnode = currnode.next;
        }
    }

    public static void insertbeg(int d, node head) {
        node headnode = head;
        node newnode = new node(d);
        newnode.next = headnode;
        head = newnode;

    }

    public static void insertend(int d, node head) {
        node currnode = head;
        while (currnode.next != null) {
            currnode = currnode.next;
        }

        node newnode = new node(d);
        currnode.next = newnode;
        newnode.next = null;

    }

    public static void insert(int pos, int data, node head) {
        node currnode = head;

        int count = 0;
        node toInsert = new node(data);
        while (count != pos - 1) {
            count++;
            currnode = currnode.next;

        }
        toInsert.next = currnode.next;
        currnode.next = toInsert;

    }

    public static void removebeg(node head) {
        node currnode = head.next;
        head.next = null;
        head = currnode;

    }

    public static void removeend(node head) {
        node currnode = head;
        node prev = null;
        while (currnode.next != null) {
            prev = currnode;
            currnode = currnode.next;
            System.out.print(currnode.data);
        }
        prev.next = null;
        traverse(head);

    }

    public static void main(String args[]) {
        listinsert l = new listinsert();
        l.head = new node(1);
        node second = new node(2);
        node third = new node(3);
        l.head.next = second;
        second.next = third;
        third.next = null;

        traverse(l.head);
        System.out.println("");
        insertbeg(4, l.head);
        traverse(l.head);
        System.out.println("");
        insertend(5, l.head);
        traverse(l.head);
        System.out.println("");
        insert(2, 4, l.head);
        traverse(l.head);
        System.out.println("");
        removebeg(l.head);
        traverse(l.head);
        // System.out.println("After removing from end");
        // removeend(l.head);

        LinkedList<Integer> li = new LinkedList<Integer>();
        li.add(1);
        li.add(2);
        li.add(4);
        li.add(5);
        li.add(6);
        li.add(3);
        li.sort(Comparator.naturalOrder());
        Collections.reverse(li);
        System.out.print("Return the number of occurance of an element \n");
        System.out.println(Collections.frequency(li, 2));
        Collections.swap(li, 1, 2);
        Collections.rotate(li, -1);

        System.out.print(li.toString());

    }
}