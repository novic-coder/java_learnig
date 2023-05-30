package Introduction;

import java.util.ArrayList;

public class ArrayListE {
    public static void main (String [] args)
    {
        // Declaring arraylist with initial size n
        ArrayList<Integer> al = new ArrayList<>();

        // Appending new element at the end of list
        for (int i =0;i<=5;i++)
            al.add(i);

        // printing the elements
        System.out.println(al);

        // remove element at index 2

        al.remove(2);

        // printing after deletion
        System.out.println(al);

        // printing elemets one by one

        for (int i = 0; i<al.size();i++)
            System.out.print(al.get(i) + " ");

    }
}
