package DequeImplementation;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeOperations {

    public static void main (String [] args)
    {
        // Initializing deque

        Deque<String> dq = new ArrayDeque<String>();
        // add method to insert

        dq.add("For");
        dq.addLast("Geeks");
        dq.addLast("Geeks");

        System.out.println(dq);
    }

}
