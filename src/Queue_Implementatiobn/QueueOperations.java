package Queue_Implementatiobn;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueOperations {

    public static void main(String args[]) {
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Hello");
        pq.add("My");
        pq.add("Name");
        pq.add("Is");
        pq.add("Ravi");

        System.out.println(pq);

        Queue<String> que1 = new PriorityQueue<>();
        que1.add("Geeks");
        que1.add("for");
        que1.add("Geeks");

        System.out.println("Initial Queue " + que1);
        que1.remove("Geeks");
        System.out.println("After Remove " + que1);
        System.out.println("Poll Method " + que1.poll());
        System.out.println("Final Queue " + que1);

        Queue<Integer> que2 = new PriorityQueue<>();

        for (int i = 1; i <= 5; i++)
            que2.add(i);

        System.out.println(que2);

        // Iterating through the QUE2

        Iterator iterator = que2.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next()+ " ");
        }
    }
}
