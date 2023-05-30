package Introduction;

import java.net.Inet4Address;
import java.util.PriorityQueue;

public class PriQueEX {

    //main method
    public static void main (String [] args)
    {

        PriorityQueue<Integer> pque1 = new PriorityQueue<Integer>();

        // adding elements to PQue using add()
        pque1.add(10);
        pque1.add(20);
        pque1.add(15);

        // printing the top element of the priority queue

        System.out.println(pque1.peek());

        // printing and removing top element

        System.out.println(pque1.poll());

        // printing the top element again
        System.out.println(pque1.peek());
    }
}
