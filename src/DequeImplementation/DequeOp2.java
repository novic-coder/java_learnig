package DequeImplementation;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeOp2 {

    public static void main (String [] args)
    {
        Deque<Integer> dq = new ArrayDeque<Integer>();

        for (int i = 0; i<5; i++ )
            dq.add(i);

        dq.add(5);
        dq.addFirst(6);
        dq.addLast(7);

        System.out.println(dq);

        System.out.println(dq.pop());
        System.out.println(dq.poll());
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
    }
}
