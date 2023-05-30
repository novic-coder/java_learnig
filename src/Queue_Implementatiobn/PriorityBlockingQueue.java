package Queue_Implementatiobn;

import java.util.Queue;

public class PriorityBlockingQueue {

    public static void main (String [] args)
    {
        // Creating an empty priority blocking QUEUE

        Queue<Integer>pbq = new java.util.concurrent.PriorityBlockingQueue<Integer>();

        // Adding element to pbq

        pbq.add(10);
        pbq.add(20);
        pbq.add(30);

        // Printing the top element of priority blocking queue

        System.out.println(pbq.peek());

        System.out.println(pbq.poll());

        System.out.println(pbq.peek());

        

    }
}
