package DequeImplementation;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEX {

    public static void main (String [] args)
    {
        // Initializing the deque

        Deque<Integer> de_que = new ArrayDeque<Integer>(10);

        // Add element

        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);

        System.out.println(de_que);

        // clear the queue

        de_que.clear();

        de_que.addFirst(200);
        de_que.add(300);
        de_que.addLast(400);
        de_que.addLast(500);

        System.out.println(de_que);
    }

}
