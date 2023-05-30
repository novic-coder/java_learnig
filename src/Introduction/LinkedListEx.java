package Introduction;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main (String [] args)
    {
        // Declaring the linked List
        LinkedList<Integer> l1 = new LinkedList<Integer>();

        // Appending the new elements at the end of the list

        for (int i = 1 ; i<=5 ; i++)
            l1.add(i);


        // printing the elements

        System.out.println(l1);


        // removing elements at index 3
        l1.remove(3);

        // printing the after deleting

        System.out.println(l1);

        // printing elements one by one

        for (int i =0; i<l1.size(); i++)
            System.out.print(l1.get(i)+ " ");
    }
}
