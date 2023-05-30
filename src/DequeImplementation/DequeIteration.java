package DequeImplementation;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeIteration {

    public static void main(String[] args) {
        // two ways Iteration is available

        Deque<String> dq = new ArrayDeque<String>();

        // adding elements to deque

        dq.add("For");
        dq.addFirst("Geeks");
        dq.addLast("Geeks");
        dq.add("Is Good");


        // Iterating through forward direction
        for (Iterator itr = dq.iterator();
             itr.hasNext(); ) {
            System.out.print(itr.next() + " ");

        }
        System.out.println();

        //Reverse Iteration

        for (Iterator itr = dq.descendingIterator();
             itr.hasNext(); ) {
            System.out.print(itr.next()+ " ");

        }
    }
}