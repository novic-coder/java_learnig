package DequeImplementation;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main (String [] args)
    {
        Deque<String> deque = new LinkedList<String>();

        // Adding elements to queue in various ways

        deque.add("Element 1 (Tail)");

        // Adding element to first
        deque.addFirst("Element 2 (Head)");

        // Adding element to last

        deque.addLast("Element 3 (Tail)");

        // add at first
        deque.push("Element 4 (Head)");

        // add at last

        deque.offer("Element 5 (Tail)");

        deque.offerFirst("Element 6 (Head)");

        System.out.println(deque +"\n");

        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque after removing first and Last elements " +deque );

    }

}
