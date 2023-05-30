package LinkedListImplementation;

import java.util.LinkedList;

public class Example1 {

    // main driver method
    public static void main (String [] args)
    {
        // creating object of the class Linked List

        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the linked list

        ll.add("A");
        ll.add("B");
        ll.add("c");
        ll.add("D");
        ll.add("E");

        System.out.println(ll);

        ll.remove("3");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
