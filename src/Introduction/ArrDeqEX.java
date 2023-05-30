package Introduction;

import java.util.ArrayDeque;

public class ArrDeqEX {

    public static void main (String [] args)
    {
        // Initializing an deque

        ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10);

        // add() mehod to insert

        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);

        System.out.println(de_que);
        // clear method
        de_que.clear();

        // add first - adds element at first Index
        de_que.addFirst(500);
        de_que.addFirst(600);
        de_que.addLast(400);
        de_que.addLast(300);

        System.out.println(de_que);
    }
}
