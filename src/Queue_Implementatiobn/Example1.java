package Queue_Implementatiobn;

import java.util.LinkedList;
import java.util.Queue;

public class Example1 {

    public static void main (String [] args)
    {
        Queue<Integer> que = new LinkedList<>();

        // Adding the elements to queue

        for (int i =0 ; i<5 ; i++)
            que.add(i);

        // Displaying the contents

        System.out.println("Elements of Queue "+que);


        // Remove the head of the queue

        int removehead = que.remove();
        System.out.println("Removed Element is "+removehead);

        System.out.println(que);

        // Remove the head of Queue

        int head = que.peek();
        System.out.println("Head of the queue - "+head);

        int size = que.size();
        System.out.println("The size of queue is "+size);

    }
}
