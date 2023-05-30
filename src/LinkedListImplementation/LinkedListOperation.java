package LinkedListImplementation;

import java.util.LinkedList;

public class LinkedListOperation {

    public static void main (String [] args)
    {
        LinkedList<String> ll = new LinkedList<String>();


        ll.add("Geeks");
        ll.add("for");
        ll.add("Geeks");

        System.out.println(ll);

        // we can change the element of LL using set()

        LinkedList<String> ll2 = new LinkedList<String>();

        ll2.add("MS Dhoni");
        ll2.add("Suresh Raina");
        ll2.add("Yuvraj Singh");
        ll2.add("Hardik Pandiya");
        ll2.add("Bumrah");

        System.out.println("The Initial LinkedList "+ ll2);

        ll2.set(0,"Mahendra singh Dhoni");

        System.out.println("The Updated Linked List "+ ll2);

        // removing the elements of the Linked list

        ll2.remove("Bumrah");
        ll2.remove(2);

        System.out.println("The Linked lIst after removing "+ ll2);


        // iterating through the Linked list

        // iterating over the fist list

        for (int i =0; i<ll.size();i++){
            System.out.print(ll.get(i));
        }
        System.out.println();

        for (int i =0;i<ll2.size();i++){
            System.out.print(ll2.get(i));
        }

        // Using for loop

        for (String players : ll2)
            System.out.print(players + " ");

    }

}
